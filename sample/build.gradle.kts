plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    compileSdk = 34

    defaultConfig {
        minSdk = 23
        applicationId = "com.davemorrissey.labs.subscaleview.test"
        versionCode = 4
        versionName = "3.1.0"
    }

    sourceSets["main"].assets.srcDirs("assets")
    sourceSets["main"].java.srcDirs("src/main/kotlin")

    namespace = "com.davemorrissey.labs.subscaleview.test"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        viewBinding = true
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":library"))
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}
