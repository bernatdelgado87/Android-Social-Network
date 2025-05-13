package app.mistercooper.domain.common.feature.media.usecase

import app.mistercooper.domain.common.arch.usecase.None
import app.mistercooper.domain.common.arch.usecase.UseCase
import app.mistercooper.domain.common.feature.media.repository.MediaRepository
import javax.inject.Inject

class GetMediaImagesFromDeviceUseCase @Inject constructor(private val mediaRepository: MediaRepository): UseCase<Unit, None>() {
    override suspend fun run(params: None) {
        return mediaRepository.getSavedImages()
    }
}