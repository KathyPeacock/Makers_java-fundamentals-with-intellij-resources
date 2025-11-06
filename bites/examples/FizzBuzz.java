package bites.examples;

public class FizzBuzz {
    public static void main(String[]args) {

//        System.out.println(FizzBuzz.play(1));
//        System.out.println(FizzBuzz.play(3));
//        System.out.println(FizzBuzz.play(5));
//        System.out.println(FizzBuzz.play(15));

//        for(int counter = 1; counter <= 100; counter++) {
//            System.out.println(play(counter));
        int counter = 100;
        while(counter >= 1) {
            System.out.println(play(counter));
            counter--;
        }
    }

    public static String play(Integer number) {

        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }
    }

