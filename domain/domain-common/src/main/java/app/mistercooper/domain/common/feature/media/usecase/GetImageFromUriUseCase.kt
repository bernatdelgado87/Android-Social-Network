package app.mistercooper.domain.common.feature.media.usecase

import app.mistercooper.domain.common.feature.media.repository.MediaRepository
import app.mistercooper.domain.common.arch.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.File
import javax.inject.Inject

class GetImageFromUriUseCase @Inject constructor(private val mediaRepository: MediaRepository) :
    UseCase<File, String>() {
    override suspend fun run(params: String): File {
        return mediaRepository.getSavedImageByUri(params)
    }
}