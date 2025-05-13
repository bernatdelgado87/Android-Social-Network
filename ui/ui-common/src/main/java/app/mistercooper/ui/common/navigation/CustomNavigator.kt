package app.mistercooper.ui.common.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

interface CustomNavigator {
    @Composable
    fun showBottomSheet(bottomSheetRoute: ModalDestination)
}

fun NavController.navigate(navigationRoute: NavigationRoute) {
    navigate(navigationRoute)
}

sealed class ArgumentNavigatorWrapper {
    data class BooleanArg(val value: Boolean) : ArgumentNavigatorWrapper()
    data class LongArg(val value: Long) : ArgumentNavigatorWrapper()
    data class FunctionArg(val value: () -> Unit) : ArgumentNavigatorWrapper()
}
