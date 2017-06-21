package builder

/**
 * @author Sergey Chistyakov <serge.chistyakov@gmail.com>
 *         21.06.2017
 */

fun main(args: Array<String>) {
    val facts = NutritionFacts()
            .apply {
                servingSize = 100
                servings = 2
                calories = 200
                fat = 80
                sodium = 25
                carbohydrate = 12
            }
}