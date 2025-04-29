package app.mistercooper.ui.comment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.mistercooper.domain.comment.usecase.GetCommentsUseCase
import app.mistercooper.domain.comment.usecase.PublishCommentUseCase
import app.mistercooper.ui.comment.model.PublishCommentUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CommentViewModel @Inject constructor(
    private val publishCommentUseCase: PublishCommentUseCase,
    private val getCommentsUseCase: GetCommentsUseCase,
) : ViewModel() {
    private val _commentUiModelState = MutableStateFlow(PublishCommentUiModel())
    val commentUiModel = _commentUiModelState.asStateFlow()

    fun publishComment(comment: String, postId: Long, commentReferentId: Int? = null) {
        viewModelScope.launch {
            _commentUiModelState.emit(commentUiModel.value.copy(isError = false, isLoadingPublish = true))
            publishCommentUseCase(PublishCommentUseCase.PublishCommentParams(comment, postId, commentReferentId))
                .onSuccess { response ->
                    _commentUiModelState.emit(PublishCommentUiModel(commentWrapper = response))
                }
                .onFailure {
                    _commentUiModelState.emit(commentUiModel.value.copy(isError = true, isLoadingPublish = false))
                }
        }
    }

    fun getComments(postId: Long) {
        viewModelScope.launch {
            _commentUiModelState.emit(commentUiModel.value.copy(isError = false, isLoadingComments = true))
            getCommentsUseCase(GetCommentsUseCase.GetCommentsParams(postId))
                .onSuccess { response ->
                    _commentUiModelState.emit(PublishCommentUiModel(commentWrapper = response))
                }
                .onFailure {
                    it.printStackTrace()
                    _commentUiModelState.emit(commentUiModel.value.copy(isError = true, isLoadingComments = false))
                }
        }
    }
}