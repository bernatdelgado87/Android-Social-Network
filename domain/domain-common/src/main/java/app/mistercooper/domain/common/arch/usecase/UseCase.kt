package app.mistercooper.domain.common.arch.usecase

abstract class UseCase<out T, in Params : Any>() {

    abstract suspend fun run(params: Params): T

    suspend operator fun invoke(params: Params = None as Params) = runCatching { run(params) }.onFailure { it.printStackTrace() }

}

object None
