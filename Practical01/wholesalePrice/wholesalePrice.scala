object wholesalePrice {

  def main(args: Array[String]): Unit = {
    val coverPrice = 24.95
    val discount = 0.4
    val shippingFirst50 = 3.0
    val shippingPerAdditional = 0.75

    def wholesaleCost(numCopies: Int): Double = {
      val discountedPrice = coverPrice * (1 - discount)
      val shippingCost = if (numCopies <= 50) {
        shippingFirst50
      } else {
        shippingFirst50 + (numCopies - 50) * shippingPerAdditional
      }
      discountedPrice * numCopies + shippingCost
    }

    val totalCost60Copies = wholesaleCost(60)
    println(s"The total wholesale cost for 60 copies is Rs. $totalCost60Copies")
  }
}