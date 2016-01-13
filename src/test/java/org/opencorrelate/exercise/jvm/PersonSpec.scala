import org.opencorrelate.exercise.jvm.Computer
import org.opencorrelate.exercise.jvm.Person

import org.scalatest._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PersonSpec extends FlatSpec with Matchers {

  "A Person" should "should own a computer" in {
    val c = new Computer("ticonderoga")
    val p = new Person("Prez", c)
    
    assert(p.name == "Prez")
    assert(p.computer == c)
    
    val cname = c.getName
    assert(cname == "ticonderoga")
  }

  
}