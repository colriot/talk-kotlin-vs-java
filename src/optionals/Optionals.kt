package optionals

import java.util.*

/**
 * @author Sergey Ryabov <colriot@gmail.com>
 * 20/06/2017
 */

class KEmployee(val name: String, val company: KCompany? = null, val employedAt: Date? = null)
class KCompany(val name: String, val address: String? = null)

fun print(employee: KEmployee) {
  println("${employee.name} works for ${employee.company?.name ?: "food"} " +
      "in ${employee.company?.address ?: "cyberspace"} " +
      "since ${employee.employedAt?.toGMTString() ?: "birth"}")
}

fun main(vararg args: String) {
  val jetbrains = KCompany("JetBrains", "Petersburg")
  val masha = KEmployee("Masha", jetbrains, Date())
  val pasha = KEmployee("Pasha")

  print(pasha)
  print(masha)
}