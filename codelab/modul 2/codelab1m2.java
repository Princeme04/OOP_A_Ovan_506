public class codelab1m2 {
    public void animal1(){
        String hewan1 = "Cat";
        String type1 = "Mammal";
        String suara1 = "Nyann~~";

        System.out.println("Name:"+ hewan1);
        System.out.println("Type: "+ type1);
        System.out.println("Sound: "+ suara1);
    }
    public static void animal2(){
        String hewan2 = "Dog";
        String type2 = "Mammal";
        String Suara2 = "Woof-woof!!";

        System.out.println("\nName: "+ hewan2);
        System.out.println("Type: "+ type2);
        System.out.println("Sound: "+ Suara2);
    }





    public static void main (String[] args){
        codelab1m2 kucing = new codelab1m2();
        kucing.animal1();

        animal2();

    }
}
