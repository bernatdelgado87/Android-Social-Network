plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
    id("com.google.devtools.ksp")
    kotlin("plugin.serialization")
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
    ksp(libs.dagger.hilt.core.compiler)

    //todo android for URI
    //implementation(libs.android.library)

}