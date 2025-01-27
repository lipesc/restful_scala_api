// build.sbt
lazy val root = (project in file("."))
  .settings(
    name := "lipesc-teste-task-api",
    version := "0.1.0",
    scalaVersion := "2.13.12"
  )

// Dependencies
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.8.20",       // Play Framework
  "com.typesafe.slick" %% "slick" % "3.4.1",      // Slick for DB
  "org.postgresql" % "postgresql" % "42.6.0",     // PostgreSQL driver
  "com.pauldijou" %% "jwt-play" % "9.0.5",        // JWT for auth
  "org.scalatest" %% "scalatest" % "3.2.17" % Test // Testing
)
