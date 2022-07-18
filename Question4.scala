object question4 extends App(){
  def discount(price:Double):Double={
    return price*0.4
  }

  def shippingcost(quantity:Double):Double={
    if(quantity>50){
        return 50*3+((quantity-50)*0.75)
    }else{
      return quantity*3
    }
  }
  def totalcost(quantity:Int):Double={
    return (24.95*quantity+shippingcost(quantity))-discount(quantity*24.95)

  }

  println(totalcost(60));


}