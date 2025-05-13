package app.mistercooper.social.domain.feature.publish.usecase

import app.mistercooper.domain.common.arch.usecase.UseCase
import app.mistercooper.domain.publish.repository.PublishRepository
import java.io.File
import javax.inject.Inject

class PublishPostUseCase @Inject constructor(val socialRepository: PublishRepository) :
    UseCase<Unit, PublishPostUseCase.PublishPostParams>() {
    override suspend fun run(params: PublishPostParams) {
        return socialRepository.publishPost(params.text, params.file)
    }

    data class PublishPostParams(val text: String, val file: File)
}