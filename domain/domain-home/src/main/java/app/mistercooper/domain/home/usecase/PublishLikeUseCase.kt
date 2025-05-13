package app.mistercooper.domain.home.usecase

import app.mistercooper.domain.common.arch.usecase.UseCase
import app.mistercooper.domain.home.repository.HomeRepository
import javax.inject.Inject

class PublishLikeUseCase @Inject constructor(private val socialRepository: HomeRepository): UseCase<Unit, PublishLikeUseCase.PublishLikeParams>() {
    override suspend fun run(params: PublishLikeParams) {
        return socialRepository.publishLike(params.postId, params.like)
    }

    data class PublishLikeParams(val postId: Long, val like: Boolean)
}