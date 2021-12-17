plugins {
	`java-library`
}

group="me.danny"
version="0.0.1-SNAPSHOT"
val spigotVersion="1.18.1-R0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<JavaCompile> {
	//options.compileArgs.add("--enable-preview")
	options.encoding="UTF-8"
}

tasks.named<Copy>("processResources") {
    val ver = version
    filesMatching("plugin.yml") {
        expand("version" to ver)
    }
}

repositories {
	mavenCentral()
	maven ("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
	compileOnly("org.spigotmc:spigot-api:$spigotVersion")
}
