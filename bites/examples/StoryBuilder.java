package bites.examples;

public class StoryBuilder {
    String plot = "";

    public void StoryBuilder() {
        this.plot = "";
    }

    public void addPlotline(String newPlotline) {
         plot = plot + newPlotline;
    }

    public String getPlot() {
        return plot;
    }

    public static void main(String[] args) {
        StoryBuilder story = new StoryBuilder();
        story.addPlotline("One day, Kathy started talking to her rubber duck. ");
        story.addPlotline("She immediately went mad.");
        System.out.println(story.getPlot());
   }



}
