plugins {
    id("java")
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.liquibase:liquibase-core:4.29.1")
    implementation("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    implementation("org.mariadb.jdbc:mariadb-java-client:3.5.2")
}

tasks.test {
    useJUnitPlatform()
}