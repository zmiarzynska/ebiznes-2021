package models

import play.api.libs.json.Json


case class Payment (id: Int, amount: Int, payment_type:String)

object Payment {
  implicit val paymentFormat = Json.format[Payment]
}
