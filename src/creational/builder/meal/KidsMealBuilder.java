package creational.builder.meal;

public class KidsMealBuilder  extends  MealBuilder{
    public void buildDrink() {
        // add drinks to the meal
        meal.drink="mini Coke";
    }

    public void buildMain() {
        // add main part of the meal
        meal.main="Kids burger";
    }

    public void buildDessert() {
        // add dessert part to the meal
        meal.desert="Ice cream";
    }

    public Meal getMeal() {
        return meal;
    }}
