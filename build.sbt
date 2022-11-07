val ScalaVersion = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    organization        := "com.mchange",
    name                := "sqlutil-scala3",
    version             := "0.0.1-SNAPSHOT",
    scalaVersion        := ScalaVersion,
    resolvers += Resolver.mavenLocal
  )

