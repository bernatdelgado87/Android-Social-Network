package app.mistercooper.domain.register_login.repository

import app.mistercooper.domain.register_login.model.LoginUserModel
import app.mistercooper.domain.register_login.model.RegisterUserModel

interface UserRepository {
    suspend fun registerUser(registerUserModel: RegisterUserModel)
    suspend fun login(loginUserModel: LoginUserModel)

    fun getApiKey(): String?

}