public class Car {
    private String type;
    private String color;
    private int num_of_tire;

    public Car(String inputType, String inputColor, int inputTireNum){
        this.type = inputType;
        this.color = inputColor;
        this.num_of_tire = inputTireNum;
    }

    public void setType(String type) {
        this.type = Car.this.type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTiresNum(int tire) {
        this.num_of_tire = tire;
    }

    public void showIdentity() {
        System.out.println("Saya Mobil dengan detail, Type: "+type+", color: "+color+", num of tire: "+num_of_tire);
    }
}