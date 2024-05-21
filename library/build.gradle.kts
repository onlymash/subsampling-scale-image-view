plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    compileSdk = 34

    defaultConfig {
        minSdk = 23
        consumerProguardFiles("proguard-rules.txt")
    }

    sourceSets["main"].java.srcDirs("src/main/kotlin")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    namespace = "com.davemorrissey.labs.subscaleview"
}

dependencies {
    implementation(libs.androidx.annotation)
    implementation(libs.androidx.exifinterface)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.kotlin.coroutines)
}