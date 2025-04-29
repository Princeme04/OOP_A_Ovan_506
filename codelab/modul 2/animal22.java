public class animal22 {
    String hewan;
    String type;
    String suara;

    public animal22(String hewan, String type, String suara){
        this.hewan = hewan;
        this.type = type;
        this.suara = suara;
    }
    public void displayInfo() {
        System.out.println("Name: "+ hewan);
        System.out.println("Type: "+ type);
        System.out.println("Sound: "+ suara);
    }
}

