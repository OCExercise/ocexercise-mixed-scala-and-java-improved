package org.opencorrelate.exercise.jvm

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


class ScalaApplicationRunner extends CommandLineRunner {

    val log = LoggerFactory.getLogger(classOf[ScalaApplicationRunner])

    override def run(args: String*) {

        val c = new Computer("ticonderoga")
        val p1 = new Person("Prez", c)
        val p2 = new Person("Bob", c)

        if (0 < args.length) {
            log.info("args: {}", args.mkString(","))
        }
        log.info("{} wrote a Scala application on {}, {}.  {} does not exist, and he definitely doesn't own {}.", p1, p1.computer, p2, p2.computer)

    }
}

object ScalaApplication {
    
    
    def main(args: Array[String]): Unit = SpringApplication.run(classOf[ScalaApplicationRunner], args: _*)
  
}