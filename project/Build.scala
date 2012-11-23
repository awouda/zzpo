import sbt._
import Keys._

/*
project build definition
 */

object ZZPOBuild extends Build {
    lazy val root = Project(id = "zzpo",
                            base = file(".")) aggregate(domain,service)

    lazy val domain = Project(id = "zzpo-domain",
                           base = file("zzpo-domain"))

    lazy val service = Project(id = "zzpo-service",
                           base = file("zzpo-service")) dependsOn(domain)
}
