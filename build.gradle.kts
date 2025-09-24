plugins {
    application
    java
}

group = "com.task1"
version = "1.0"

repositories {
    mavenCentral()
}


// Allow building without moving sources: treat top-level `com` folder as the main Java source root.
// Recommended: move sources to the standard Gradle layout `src/main/java/com` when ready.
sourceSets {
    getByName("main").java.srcDirs("com")
}


application {
    mainClass.set("com.Main")
}
