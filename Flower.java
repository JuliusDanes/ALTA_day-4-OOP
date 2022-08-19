public class Flower {
    private String nama;
    private String color;
    private int num_of_petal;

    public Flower(String inputJenis, String inputColor, int inputPetalsNum){
        this.nama = inputJenis;
        this.color = inputColor;
        this.num_of_petal = inputPetalsNum;
    }

    public void setJenis(String jenis) {
        this.nama = jenis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPetalsNum(int petals) {
        this.num_of_petal = petals;
    }

    public void showIdentity() {
        System.out.println("Saya Bunga dengan detail, Jenis: "+nama+", color: "+color+", num of petal: "+num_of_petal);
    }
}