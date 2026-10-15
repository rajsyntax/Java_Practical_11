package DigitalClock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Source mein given format:
        // hh = 12-hour format
        // mm = minutes
        // ss = seconds
        // a  = AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("Current Time:");

        while (true) {

            // Har iteration mein current date/time obtain kar rahe hain.
            Date now = new Date();

            // \r cursor ko current line ke beginning par le aata hai.
            // Isse clock continuously update hoti hui dikhti hai.
            System.out.print("\r" + sdf.format(now));

            try {

                // Program ko 1000 milliseconds = 1 second pause karna hai.
                Thread.sleep(1000);

            } catch (InterruptedException e) {

                // Agar thread interrupt ho jaye to loop safely stop karenge.
                System.out.println("\nClock interrupted.");
                break;
            }
        }
    }
}