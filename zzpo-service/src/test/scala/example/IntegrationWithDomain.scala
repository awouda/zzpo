package example

import org.scalatest.FunSuite
import scala.collection.mutable.Stack
import com.jtm.zzpo.model._
 
class IntegrationWithModel extends FunSuite {

  test("dding") {
   val a = 1
   println(new User())
   assert (a < 2) 
}
 
  test("first service test") {
     
    assert(true)

  }
 

}

