public class Encapsulation {
    public static void main(String[] args) {
        Cat cat = new Cat("Hitam", 4);
        Fish fish = new Fish("paus","plankton");
        Flower flower = new Flower("bangkai","merah",12);
        Car car = new Car("sedan","merah", 4);

        cat.showIdentity();

        cat.setColor("Putih");
        cat.setLegs(3);
        cat.showIdentity();

        cat.setColor("Hitam Putih");
        cat.setLegs(4);
        cat.showIdentity();

        cat.setColor("poleng poleng");
        cat.setLegs(3);
        cat.showIdentity();

        cat.setColor("bintik bintik");
        cat.setLegs(4);
        cat.showIdentity();

        System.out.println("");

        fish.showIdentity();

        fish.setType("cupang");
        fish.setFeed("cacing");
        fish.showIdentity();

        fish.setType("arwana");
        fish.setFeed("jangkrik");
        fish.showIdentity();

        fish.setType("sapu-sapu");
        fish.setFeed("pelet");
        fish.showIdentity();

        System.out.println("");

        flower.showIdentity();

        flower.setJenis("anggrek");
        flower.setColor("putih");
        flower.setPetalsNum(8);
        flower.showIdentity();

        flower.setJenis("mawar");
        flower.setColor("merah");
        flower.setPetalsNum(3);
        flower.showIdentity();

        flower.setJenis("melati");
        flower.setColor("kuning");
        flower.setPetalsNum(5);
        flower.showIdentity();

        System.out.println("");

        car.showIdentity();

        car.setType("truk");
        car.setColor("hijau");
        car.setTiresNum(6);
        car.showIdentity();

        car.setType("tronton");
        car.setColor("coklat");
        car.setTiresNum(12);
        car.showIdentity();

        car.setType("angkot");
        car.setColor("kuning");
        car.setTiresNum(4);
        car.showIdentity();

    }
}