package com.jtm.zzpo.model



case class User(id: Option[Int], first: String, last: String)



object User {

  def apply():User = User(None,"","")

}
