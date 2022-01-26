package VechicleCatalogueV2;

public class Truck {
    private String type;
    private String model;
    private String color;
    private int horsepower;


    public Truck(String model, String color, int horsepower) {
        this.type = "Truck";
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
        builder.append("Type: ").append(this.type).append("\n");
        builder.append("Model: ").append(this.model).append("\n");
        builder.append("Color: ").append(this.color).append("\n");
        builder.append("Horsepower: ").append(this.horsepower).append("\n");
        return builder.toString();
    }
}
