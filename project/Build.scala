import sbt._
import Keys._

object Build extends Build {
  val sharedSettings = Defaults.defaultSettings ++ Seq(
    organization := "org.smop",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.10.0-M3",
    scalacOptions ++= Seq("-unchecked", "-Ymacro-debug-lite")
  )

  lazy val root = Project(
    id = "utils",
    base = file("."),
    settings = sharedSettings ++ Seq(
      name := "smop-utils",
      libraryDependencies ++= Seq(
        "org.specs2" %% "specs2" % "1.9" % "test"
  )))
}
