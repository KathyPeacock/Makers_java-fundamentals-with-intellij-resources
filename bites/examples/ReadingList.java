package bites.examples;

public class ReadingList {

    String[] unread = new String[5];

    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();
        readingList.add("Rebecca");
        readingList.add("Forty Rules of Love");
        readingList.add("Still Life");
        readingList.add("Tender is the Flesh");
//        readingList.add("Matrix");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
        System.out.println(readingList.unread[4]);

    }

    private void add(String title) {
        Boolean SearchForEmpty = true;
        Integer index = 0;
        while (SearchForEmpty) {
            if (unread[index] == null) {
                unread[index] = title;
                SearchForEmpty = false;
            } else {
                index++;
            }
        }
    }
}


