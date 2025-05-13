plugins {
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.jetbrainsKotlinJvm)
    alias(libs.plugins.kspAndroid)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    api(project(":domain:domain-common"))
    //Hilt Domain
    implementation(libs.dagger.hilt.core)
    ksp(libs.dagger.hilt.core.compiler)
}