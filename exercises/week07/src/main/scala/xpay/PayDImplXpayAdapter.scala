package xpay

/**
  * Created by Eric's laptop on 27/04/2017.
  */
class PayDImplXpayAdapter (var xpayObject: XpayImpl) extends PayD {

  def getCustCardNo: String = {
    xpayObject.getCreditCardNo().toString
  }

  def setCustCardNo(custCardNo: String){
    xpayObject.setCreditCardNo(custCardNo)
  }


  def getCardOwnerName: String = {
    xpayObject.getCustomerName.toString
  }

  def setCardOwnerName(cardOwnerName: String): Unit ={
    xpayObject.setCustomerName(cardOwnerName)
  }

  def getCardExpMonthDate: String = {
    xpayObject.getCardExpMonth
  }

  def setCardExpMonthDate(cardExpMonthDate: String): Unit ={
    xpayObject.setCardExpMonth(cardExpMonthDate)
  }

  def getCVVNo: Integer = {
    xpayObject.getCardCVVNo.toInt
  }

  def setCVVNo(cVVNo: Integer): Unit ={
    xpayObject.setCardCVVNo(cVVNo.toShort)
  }

  def getTotalAmount: Double = {
    xpayObject.getAmount
  }

  def setTotalAmount(totalAmount: Double): Unit ={
    xpayObject.setAmount(totalAmount)
  }

}
