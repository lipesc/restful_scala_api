// build.sbt
lazy val root = (project in file("."))
  .settings(
    name := "restfulscalaapi",
    version := "0.1.0",
    scalaVersion := "2.12.20"
  )

val playDependencies = Seq(
 "com.typesafe.play" %% "play-test" % "2.8.8" % Test,
  "com.github.jwt-scala" %% "jwt-play-json" % "10.0.1"
)

val databaseDependencies = Seq(
  "com.typesafe.slick" %% "slick" % "3.5.2",
  "org.postgresql" % "postgresql" % "42.7.5"
)

val testDependencies = Seq(
   "org.scalatest" %% "scalatest" % "3.2.17" % Test 
)

libraryDependencies ++= playDependencies ++ databaseDependencies ++ testDependencies
resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"