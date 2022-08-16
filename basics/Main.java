import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(4);
        clock();
    }

    public static String pluralize(String word, int num) {
        if (num > 1 || num == 0) {
            return (word + "s");
        } else {
            return word;
        }

    }

    public static void flipNHeads(int n) {
        Random random = new Random();
        int flips = 0;
        int headCount = 0;
        do {
            flips += 1;
            float flip = random.nextFloat();
            if (flip > .5) {
                System.out.println("tails");
                headCount = 0;
            } else {
                System.out.println("heads");
                headCount += 1;
            }

        } while (headCount < n);
        System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    }

    private static void clock() {
      
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            //help with try catch and Thread.sleep from https://stackoverflow.com/questions/15579480/digital-clock-on-console-window
            try {
                int second = now.getSecond();
                Thread.sleep(1000);
                System.out.println(hour + ":" + minute + ":" + second);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}