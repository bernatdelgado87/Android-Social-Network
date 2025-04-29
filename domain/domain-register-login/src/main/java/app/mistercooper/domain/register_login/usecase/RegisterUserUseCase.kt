package app.mistercooper.domain.register_login.usecase

import app.mistercooper.domain.common.arch.usecase.UseCase
import app.mistercooper.domain.register_login.model.RegisterUserModel
import app.mistercooper.domain.register_login.repository.UserRepository
import javax.inject.Inject

class RegisterUserUseCase @Inject constructor(val userRepository: UserRepository) : UseCase<Unit, RegisterUserModel>() {
    override suspend fun run(params: RegisterUserModel) { return userRepository.registerUser(params) }
}