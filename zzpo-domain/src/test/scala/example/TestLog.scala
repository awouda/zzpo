package example

import org.scalatest.FunSuite
import scala.collection.mutable.Stack
import org.slf4j.LoggerFactory

 
class TestLogSuite extends FunSuite {

   val logger = LoggerFactory.getLogger(classOf[TestLogSuite])
 
 
  test("testing slf4j") {

    logger.warn("warning") 
    logger.info("information") 
    logger.trace("tracing") 
    logger.debug("debugging") 
  }
 
  test("demo test, testing some Stack stuff") {
 
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    val oldSize = stack.size
    val result = stack.pop()
    assert(result === 2)
    assert(stack.size === oldSize - 1)
  }

  test("stupid test") {

   assert(new com.jtm.zzpo.model.User().toString != null )
}

}

