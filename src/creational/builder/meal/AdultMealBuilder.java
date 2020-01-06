package creational.builder.meal;

public class AdultMealBuilder  extends  MealBuilder{
    public void buildDrink(){
        // add drinks to the meal
        meal.drink="Coke";
    }
    public void buildMain(){
        // add main part of the meal
        meal.main="Hamburger";
    }
    public void buildDessert(){
        // add dessert part to the meal
        meal.desert="Profitorol";
    }
    public Meal getMeal(){return meal;}
}
