plugins {
    alias(libs.plugins.jetbrainsKotlinJvm)
    alias(libs.plugins.kspAndroid)
    alias(libs.plugins.kotlinSerialization)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    //coroutines
    api(libs.kotlinx.coroutines)
    //Hilt Domain
    implementation(libs.dagger.hilt.core)
    ksp(libs.dagger.hilt.compiler)

    //todo android for URI
    //implementation(libs.android.library)

}