package bites.examples;

public class Bagel {
    public static void main(String[] args) {

       Bagel myBagel = new Bagel();
       myBagel.seeds();
       myBagel.filling();
       myBagel.price();


    }
    public void seeds() {
        System.out.println("poppy");
        System.out.println("sesame");
    }

    public void filling() {
        System.out.println("hot salt beef");
        System.out.println("sauerkraut");
        System.out.println("mustard");
    }

    public void price() {
        System.out.println(7.90);
    }
}
