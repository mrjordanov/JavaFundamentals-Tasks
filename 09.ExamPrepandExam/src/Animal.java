public class Animal {
    private String name;
    private int food;
    private String area;


    public Animal(String name, int food, String area) {
        this.name = name;
        this.food = food;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void feed(int foodToEat) {
        this.food -= foodToEat;
    }

}
