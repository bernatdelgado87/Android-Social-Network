package app.mistercooper.ui.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.mistercooper.domain.home.usecase.GetFeedUseCase
import app.mistercooper.domain.home.usecase.PublishLikeUseCase
import app.mistercooper.ui.home.model.HomeUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getFeedUseCase: GetFeedUseCase,
    private val publishLikeUseCase: PublishLikeUseCase
) : ViewModel() {
    private val _homeuiModelState = MutableStateFlow(
        HomeUiModel()
    )
    val homeUiModel = _homeuiModelState.asStateFlow()

    init {
        getFeed()
    }

    private fun getFeed() {
        viewModelScope.launch {
            _homeuiModelState.emit(HomeUiModel(isLoading = true))
            getFeedUseCase()
                .onSuccess { response ->
                    _homeuiModelState.emit(HomeUiModel(postModels = response.postModels))
                }
                .onFailure {
                    _homeuiModelState.emit(HomeUiModel(isError = true))
                }
        }
    }

    fun publishLike(postId: Long, like: Boolean) {
        viewModelScope.launch {
            publishLikeUseCase(PublishLikeUseCase.PublishLikeParams(postId, like))
                .onFailure {
                    _homeuiModelState.emit(HomeUiModel(isError = true))
                }
                .onSuccess { response ->
                    _homeuiModelState.emit(HomeUiModel(postModels = homeUiModel.value.postModels?.map { post ->
                        if (post.id == postId) {
                            post.copy(hasLiked = like)
                        } else {
                            post
                        }
                    }))
                }
        }
    }
}