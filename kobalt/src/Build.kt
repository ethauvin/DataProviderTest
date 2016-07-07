import com.beust.kobalt.plugin.application.application
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.project

val p = project {

    name = "DataProviderTest"
    group = "com.example"
    artifactId = name
    version = "0.1"

    sourceDirectories {
        path("src/main/java")
    }

    sourceDirectoriesTest {
        path("src/test/java")
    }

    dependencies {

    }

    dependenciesTest {
        compile("org.testng:testng:6.9.9")
        // WORKAROUND
        compile("com.google.guava:guava:19.0")
    }

    assemble {
        jar {}
    }

    application {
        mainClass = "com.example.Main"
    }

}
