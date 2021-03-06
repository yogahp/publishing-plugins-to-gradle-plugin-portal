// tag::plugins_block[]
plugins {
    `java-gradle-plugin` // <1>
    id("com.gradle.plugin-publish") version "0.10.0"  // <2>
}
// end::plugins_block[]

// tag::gradle-plugin[]
gradlePlugin {
    plugins { // <1>
        create("greetingsPlugin") { // <2>
            id = "<your plugin identifier>" // <3>
            displayName = "<short displayable name for plugin>" // <4>
            description = "<Good human-readable description of what your plugin is about>" // <5>
            implementationClass = "<your plugin class>"
        }
    }
}
// end::gradle-plugin[]

// tag::plugin_bundle[]
pluginBundle {
    website = "<substitute your project website>" // <1>
    vcsUrl = "<uri to project source repository>" // <2>
    tags = listOf("tags", "for", "your", "plugins") // <3>
}
// end::plugin_bundle[]
