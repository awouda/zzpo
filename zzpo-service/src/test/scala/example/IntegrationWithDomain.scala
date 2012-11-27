package example

import org.scalatest.FunSuite
import com.jtm.zzpo.model._
 
class IntegrationWithModel extends FunSuite {


  test("first service test, calling class from domain") {
     
    assert( User.toString!= null)

  }
 

}

