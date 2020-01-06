package creational.builder.meal;
/* The Builder provides an interface for creating the parts that make up a Product, and ConcreteBuilder provides an implementation of this
 *  interface.
 */
/* The ConcreteBuilder keep track of the representation it creates, provides a way to get the result (Product) as well as constructing the
 * product.
 */
/* The Director constructs the object through the Builder's interface. The Product is the object, usually complex, that we are constructing.
 *  This would include all the classes that define what we are constructing.
 */

// Integration with overall application
public class Main {
    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        MealBuilder builder = null;
        boolean isKid=true;

        if (isKid) {
            builder = new KidsMealBuilder();
        } else {
            builder = new AdultMealBuilder();
        }
        Meal meal = director.createMeal(builder);
        System.out.println(meal);
    }
}