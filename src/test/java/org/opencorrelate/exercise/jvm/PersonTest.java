package org.opencorrelate.exercise.jvm;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {
	
	
	@Test public void testPerson() {
		
		
		Computer c = new Computer("ticonderoga");
		Person p = new Person("Prez", c);
		
		assertEquals(p.computer(), c);
		assertEquals(p.name(), "Prez");
		assertEquals(c.getName(), "ticonderoga");
		
		
	}

}