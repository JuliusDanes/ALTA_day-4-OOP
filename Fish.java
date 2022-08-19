public class Fish {
    private String type;
    private String feed;

    public Fish(String inputType, String inputFeed){
        this.type = inputType;
        this.feed = inputFeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public void showIdentity() {
        System.out.println("Saya Ikan dengan detail, Jenis: "+type+", makanan: "+feed);
    }
}