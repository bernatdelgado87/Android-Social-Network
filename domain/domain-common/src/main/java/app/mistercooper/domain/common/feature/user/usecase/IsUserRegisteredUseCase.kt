package app.mistercooper.domain.common.feature.user.usecase

import app.mistercooper.domain.common.arch.usecase.None
import app.mistercooper.domain.common.arch.usecase.UseCase
import app.mistercooper.domain.common.feature.user.repository.MainRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class IsUserRegisteredUseCase @Inject constructor(val userRepository: MainRepository) :
    UseCase<Boolean, None>() {
    override suspend fun run(params: None): Boolean {
        return userRepository.isUserRegistered()
    }

}