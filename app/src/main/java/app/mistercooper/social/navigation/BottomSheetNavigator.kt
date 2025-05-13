package app.mistercooper.social.navigation

import androidx.compose.runtime.Composable
import app.mistercooper.ui.comment.CommentsBottomSheetScreen
import app.mistercooper.ui.common.navigation.CustomNavigator
import app.mistercooper.ui.common.navigation.ModalDestination

class CustomNavigatorImpl : CustomNavigator {
    @Composable
    override fun showBottomSheet(bottomSheetRoute: ModalDestination) {
        when (bottomSheetRoute) {
            is ModalDestination.Comments -> {
                CommentsBottomSheetScreen(
                    postId = bottomSheetRoute.postId,
                    writeNow = bottomSheetRoute.writeNow,
                    onDismiss = bottomSheetRoute.onDismiss
                )
            }
        }
    }
}
