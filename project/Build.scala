import sbt._
import Keys._

object Build extends Build {
  val sharedSettings = Defaults.defaultSettings ++ Seq(
    organization := "org.smop",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.10.0",
    scalacOptions ++= Seq("-unchecked") //, "-Ymacro-debug-lite")
  )

  lazy val root = Project(
    id = "utils",
    base = file("."),
    settings = sharedSettings ++ Seq(
      name := "SMOP Utils",
      libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-reflect" % _),
      libraryDependencies ++= Seq(
        "org.specs2" %% "specs2" % "1.14" % "test"
  )))
}
