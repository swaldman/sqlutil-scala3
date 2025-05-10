val ScalaVersion = "3.3.6"

lazy val root = project
  .in(file("."))
  .settings(
    organization        := "com.mchange",
    name                := "sqlutil-scala3",
    version             := "0.0.2-SNAPSHOT",
    scalaVersion        := ScalaVersion,
    resolvers += Resolver.mavenLocal
  )

