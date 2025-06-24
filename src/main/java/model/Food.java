package model;

public record Food(String name, double calories, double protein, double fat, double carbohydrate) {
    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories + "kcal" +
                ", protein=" + protein + "g" +
                ", fat=" + fat + "g" +
                ", carbohydrate=" + carbohydrate + "g" +
                '}';
    }
}
