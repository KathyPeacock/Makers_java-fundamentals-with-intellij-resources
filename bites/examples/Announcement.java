package bites.examples;

public class Announcement {
    public static void main(String[] args) {

        Announcement myAnnouncement = new Announcement();
        String message = myAnnouncement.celebration();
        System.out.println(message);

        Integer output = myAnnouncement.changeOfPlan();
        System.out.println(output);
    }

    public String celebration() {
        return "I'm doing my best, woo!";
    }

    public Integer changeOfPlan() {
        System.out.println("Gonna have to raincheck...");
        return 100;
//
//
//        eturn "Gonna have to raincheck...";
    }

    public String apology() {
        return "I apologise profusely.";
    }

    public String politeNotice() {
        return "Terribly sorry, old chap.";
    }

    public String helpNeeded() {
        return "Get me out of here!!!";

    }
}
