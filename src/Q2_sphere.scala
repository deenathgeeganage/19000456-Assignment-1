object Q2_sphere extends App {
  def volofsphere(x:Int):Double ={
    (4/3.0) * math.Pi * math.pow(x,3)
  }
  val r = 5
  println(" **Volume Calculation**")
  print("Volume of a sphere with radius 5 : ")
  print(volofsphere(r))
}

