package compiletime

import pojos.KUser

/**
 * @author Sergey Ryabov <colriot@gmail.com>
 * 20/06/2017
 */
private fun getUser(): KUser? {
  return null
}

private fun handleUser(user: KUser) {
  println("User's name: ${user.firstName}")
}

fun main(args: Array<String>) {
  // Try to uncomment this line.
//  handleUser(getUser())
}