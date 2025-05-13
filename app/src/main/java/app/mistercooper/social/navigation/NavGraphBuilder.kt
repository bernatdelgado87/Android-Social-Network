package app.mistercooper.social.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.mistercooper.ui.common.navigation.GlobalNavigator
import app.mistercooper.ui.common.navigation.NavigationRoute
import app.mistercooper.ui.home.HomeScreen
import app.mistercooper.ui.publish.PublishHomeScreen
import app.mistercooper.ui.registerlogin.LoginOrRegisterScreen
import app.mistercooper.ui.registerlogin.LoginScreen
import app.mistercooper.ui.registerlogin.RegisterScreen

fun NavGraphBuilder.getNavGraphBuilder(globalNavigator: GlobalNavigator) = run {
    composable<NavigationRoute.HomeFeed> {
        HomeScreen(globalNavigator = globalNavigator)
    }
    composable<NavigationRoute.PublishNow> {
        PublishHomeScreen(globalNavigator = globalNavigator)
    }
    composable<NavigationRoute.LoginOrRegister> {
        LoginOrRegisterScreen(globalNavigator = globalNavigator)
    }
    composable<NavigationRoute.Register> {
        RegisterScreen(globalNavigator = globalNavigator)
    }
    composable<NavigationRoute.Login> {
        LoginScreen(globalNavigator = globalNavigator)
    }
}