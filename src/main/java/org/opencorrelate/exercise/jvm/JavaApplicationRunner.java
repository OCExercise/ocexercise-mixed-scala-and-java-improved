package org.opencorrelate.exercise.jvm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplicationRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(JavaApplicationRunner.class);
	
	
	@Override
	public void run(String... args) throws Exception {
	
		Computer c = new Computer("ticonderoga");
		Person p = new Person("Prez", c);
		
		log.info("{} wrote a Java application on {}", p, p.computer());
		

	}

}
