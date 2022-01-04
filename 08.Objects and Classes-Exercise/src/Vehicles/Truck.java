package Vehicles;

public class Truck {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Truck(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.type = "Truck";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", this.type,
                this.model, this.color, this.horsePower);
    }
}
