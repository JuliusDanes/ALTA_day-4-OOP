public class Cat {
    private String fur_color;
    private int num_of_leg;

    public Cat(String inputColor, int inputLegs){
        this.fur_color = inputColor;
        this.num_of_leg = inputLegs;
    }

    public void setColor(String color) {
        this.fur_color = color;
    }

    public void setLegs(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }

    public void showIdentity() {
        System.out.println("Saya Kucing dengan detail, Warna Bulu: "+fur_color+" dengan jumlah kaki: "+num_of_leg);
    }
}