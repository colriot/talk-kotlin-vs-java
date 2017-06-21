package compiletime

/**
 * @author Sergey Ryabov <colriot@gmail.com>
 * 20/06/2017
 */
private fun getProtectedTurtles(): List<String> {
  return listOf("Leo", "Don", "Raf", "Mike")
}

private fun getTurtles(): MutableList<String> {
  return mutableListOf("Leo", "Don", "Raf", "Mike")
}

private fun infiltrate(src: MutableList<String>) {
  src.add("Shredder")
}

fun main(args: Array<String>) {
  infiltrate(getTurtles())

  // Try to uncomment this line.
//  infiltrate(getProtectedTurtles())
}