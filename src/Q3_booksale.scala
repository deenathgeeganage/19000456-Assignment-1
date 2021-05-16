object Q3_booksale extends App {
  def amountinb(y:Int):Double = y*24.95

  def discount(x:Double):Double = (x*40)/100

  def shipping(y:Int):Double = {
    if(y>50) ((3*50)+ (y-50)*0.75)
    else 3*y
  }

  def totalcost(a:Int):Double = {
    amountinb(a)-discount(amountinb(a))+shipping(a)
  }

  println(" **Calculate wholesale cost**")
  print("Wholesale cost of 60 books : ")
  print(totalcost(60))
}
