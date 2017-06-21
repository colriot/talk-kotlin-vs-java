package builder;

/**
 * @author Sergey Chistyakov <serge.chistyakov@gmail.com>
 *         21.06.2017
 */
@SuppressWarnings("WeakerAccess")
public class NutritionFacts {
    int servingSize;
    int servings;
    int calories;
    int fat;
    int sodium;
    int carbohydrate;

    public NutritionFacts() {
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
