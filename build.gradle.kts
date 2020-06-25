plugins {
    id("org.jetbrains.kotlin.js") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    //React, React DOM + Wrappers (chapter 3)
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.109-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.109-kotlin-1.3.72")
    implementation(npm("react", "16.13.1"))
    implementation(npm("react-dom", "16.13.1"))

    //Kotlin Styled (chapter 3)
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.109-kotlin-1.3.72")

    implementation("org.jetbrains:kotlin-react-router-dom:5.1.2-pre.109-kotlin-1.3.72")

    implementation(npm("styled-components"))
    implementation(npm("inline-style-prefixer"))

    implementation(npm("bootstrap"))

    //Video Player (chapter 7)
    implementation(npm("react-player"))

    //Share Buttons (chapter 7)
    implementation(npm("react-share"))

    //Coroutines (chapter 8)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:1.3.5")

}

kotlin.target.browser { }