package app.mistercooper.domain.home.usecase

import app.mistercooper.domain.common.arch.usecase.None
import app.mistercooper.domain.common.arch.usecase.UseCase
import app.mistercooper.domain.home.model.FeedModel
import app.mistercooper.domain.home.repository.HomeRepository
import javax.inject.Inject

class GetFeedUseCase @Inject constructor(private val socialRepository: HomeRepository): UseCase<FeedModel, None>() {
    override suspend fun run(params: None): FeedModel {
        return socialRepository.getFeed()
    }
}