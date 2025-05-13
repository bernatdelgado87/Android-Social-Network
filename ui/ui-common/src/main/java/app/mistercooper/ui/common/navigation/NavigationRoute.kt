package app.mistercooper.ui.common.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface NavigationRoute {
    @Serializable
    data object HomeFeed : NavigationRoute
    @Serializable
    data object PublishNow : NavigationRoute
    @Serializable
    data object LoginOrRegister : NavigationRoute
    @Serializable
    data object Login : NavigationRoute
    @Serializable
    data object Register : NavigationRoute
}

sealed interface ModalDestination {
    data class Comments(val postId: Long, val writeNow: Boolean, val onDismiss: () -> Unit) : ModalDestination
}