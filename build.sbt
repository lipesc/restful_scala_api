// build.sbt
lazy val root = (project in file("."))
  .settings(
    name := "lipesc-teste-task-api",
    version := "0.1.0",
    scalaVersion := "2.13.12"
  )

// Dependencies
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.8.20",       
  "com.typesafe.slick" %% "slick" % "3.4.1",      
  "org.postgresql" % "postgresql" % "42.6.0",     
  "com.pauldijou" %% "jwt-play" % "9.0.5",       
  "org.scalatest" %% "scalatest" % "3.2.17" % Test 
)
