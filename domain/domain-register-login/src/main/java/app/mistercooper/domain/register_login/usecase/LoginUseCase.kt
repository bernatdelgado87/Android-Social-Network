package app.mistercooper.domain.register_login.usecase

import app.mistercooper.domain.common.arch.usecase.UseCase
import app.mistercooper.domain.register_login.model.LoginUserModel
import app.mistercooper.domain.register_login.repository.UserRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(val userRepository: UserRepository) : UseCase<Unit, LoginUserModel>() {
    override suspend fun run(params: LoginUserModel) {
        return userRepository.login(params)
    }
}