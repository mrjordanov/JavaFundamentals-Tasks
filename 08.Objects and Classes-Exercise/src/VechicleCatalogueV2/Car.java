package VechicleCatalogueV2;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsepower;


    public Car(String model, String color, int horsepower) {
        this.type = "Car";
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Type: ").append(type).append("\n");
        builder.append("Model: ").append(model).append("\n");
        builder.append("Color: ").append(color).append("\n");
        builder.append("Horsepower: ").append(horsepower).append("\n");
        return builder.toString();
    }
}
