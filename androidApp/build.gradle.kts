plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.ksp)
    //  alias(libs.plugins.serial)
    //  kotlin("plugin.serialization") version "1.9.10"
    //id("com.google.devtools.ksp") version "1.9.10-1.0.13"
    //Kotlinx Serialization
    //  kotlin("plugin.serialization") version "1.9.10"
}

android {
    namespace = "com.example.myapplication.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.myapplication.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    applicationVariants.all {
        (layout.buildDirectory.get().dir("generated/ksp/$name/kotlin"))
    }
}

dependencies {
    implementation(projects.shared)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.compose.foundation)
    implementation(libs.androidx.activity.compose)

    debugImplementation(libs.compose.ui.tooling)

    implementation(libs.io.github.raamcosta.compose.destinations)
    implementation(libs.androidx.core)
    implementation(libs.datastore)
    implementation(libs.koin.compose)
    implementation(libs.lifecycle.compose)
    implementation(libs.google.accompanist)
    implementation(libs.kt.coil.compose)


    //ksp("io.github.raamcosta.compose-destinations:ksp:1.8.38-beta")

    /* ksp("io.github.raamcosta.compose-destinations:ksp:1.8.38-beta")

     implementation("androidx.core:core-splashscreen:1.0.1")
     implementation("androidx.datastore:datastore-preferences:1.0.0")

     implementation("io.insert-koin:koin-androidx-compose:3.4.1")

     implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.1")

     implementation("com.google.accompanist:accompanist-systemuicontroller:0.28.0")

     implementation("io.coil-kt:coil-compose:2.4.0")*/
}