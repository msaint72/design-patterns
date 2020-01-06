package creational.builder.meal;

public class Meal {
    public String drink;
    public String main;
    public String desert;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return drink+"-"+main+"-"+desert;
    }
}
