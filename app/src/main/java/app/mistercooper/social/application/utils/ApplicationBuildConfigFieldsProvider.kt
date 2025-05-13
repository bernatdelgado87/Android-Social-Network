package app.mistercooper.social.application.utils

import app.mistercooper.social.BuildConfig
import app.mistercooper.ui.common.utils.BuildConfigFields
import app.mistercooper.ui.common.utils.BuildConfigFieldsProvider

class ApplicationBuildConfigFieldsProvider : BuildConfigFieldsProvider {

    override fun get(): BuildConfigFields = BuildConfigFields(
        buildType = BuildConfig.BUILD_TYPE,
        versionCode = BuildConfig.VERSION_CODE,
        versionName = BuildConfig.VERSION_NAME,
        appId = BuildConfig.APPLICATION_ID
    )
}