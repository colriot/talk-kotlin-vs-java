package namedparams

/**
 * @author Sergey Ryabov <colriot@gmail.com>
 * 20/06/2017
 */
private fun composePerson(firstName: String, lastName: String, age: Int, shoeSize: Int,
                          height: Double, weight: Double, isVegetarian: Boolean) {
  // Some usefull code here.
}

fun main(args: Array<String>) {
  composePerson(
      firstName = "Hamato",
      lastName = "Yoshi",
      age = 42,
      shoeSize = 39,
      height = 149.5,
      weight = 72.0,
      isVegetarian = true
  )
}
