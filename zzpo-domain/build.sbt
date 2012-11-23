name := "zzpo-domain"

version := "0.1"

scalaVersion := "2.9.2"



libraryDependencies ++= List(
	"com.typesafe" % "slick_2.10.0-RC1" % "0.11.2",
 	"ch.qos.logback" % "logback-classic" % "1.0.6", 
	"org.slf4j" % "slf4j-api" % "1.6.4",
	"com.h2database" % "h2" % "1.3.166",
	"org.scalatest" %% "scalatest" % "1.6.1" % "test"
)
