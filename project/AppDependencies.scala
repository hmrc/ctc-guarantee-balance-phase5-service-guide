import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootStrapPlayVersion = "8.4.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-30" % bootStrapPlayVersion
  )

  val test: Seq[ModuleID] = Seq(
    "org.pegdown"          % "pegdown"                % "1.6.0"              % "test",
    "com.vladsch.flexmark" % "flexmark-all"           % "0.36.8"             % "test",
    "org.scalatest"       %% "scalatest"              % "3.2.9"              % "test",
    "uk.gov.hmrc"         %% "bootstrap-test-play-30" % bootStrapPlayVersion % "test"
  )
}
