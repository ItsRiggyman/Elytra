import java.util.Locale

rootProject.name = "elytra"

// This bit was yoinked from Purpur: https://github.com/PurpurMC/Purpur
for (name in listOf("Elytra-API", "Elytra-Server")) {
    val projName = name.toLowerCase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}


pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}
