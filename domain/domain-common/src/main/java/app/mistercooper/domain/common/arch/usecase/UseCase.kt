package app.mistercooper.domain.common.arch.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

abstract class UseCase<out T, in Params : Any>() {

    abstract suspend fun run(params: Params): T

    suspend operator fun invoke(params: Params = None as Params) = runCatching { run(params) }.onFailure { it.printStackTrace() }

}

object None
