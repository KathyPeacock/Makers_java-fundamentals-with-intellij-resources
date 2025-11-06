package bites.examples;

public class Quiz {

    String Question1;
    String Question2;


    public Quiz(String Question1, String Question2) {
        this.Question1 = Question1;
        this.Question2 = Question2;

    }

    public String getQuestion1() {
        return this.Question1;
    }

    public String getQuestion2() {
        return this.Question2;
    }

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz("what is the capital of Burkina Faso?", "What is the capital of Bhutan?");
        System.out.println(myQuiz.getQuestion1());
        System.out.println(myQuiz.getQuestion2());

    }

}







