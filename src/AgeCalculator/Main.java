package AgeCalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Source ke required format ke according formatter.
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // Invalid date jaise 35-20-2020 ko automatically accept
        // na kare, isliye lenient false kar rahe hain.
        sdf.setLenient(false);

        System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
        String input = sc.nextLine();

        try {

            // String ko Date mein convert karna.
            Date dob = sdf.parse(input);

            // Aaj ki date obtain karna.
            Date today = new Date();

            // DOB future mein nahi honi chahiye.
            if (dob.after(today)) {
                System.out.println("Date of Birth cannot be in the future.");
                sc.close();
                return;
            }

            Calendar birth = Calendar.getInstance();
            birth.setTime(dob);

            Calendar current = Calendar.getInstance();
            current.setTime(today);

            // Initially years, months aur days ka difference nikalna.
            int years = current.get(Calendar.YEAR)
                    - birth.get(Calendar.YEAR);

            int months = current.get(Calendar.MONTH)
                    - birth.get(Calendar.MONTH);

            int days = current.get(Calendar.DAY_OF_MONTH)
                    - birth.get(Calendar.DAY_OF_MONTH);

            // Agar days negative hain to previous month se days borrow karenge.
            if (days < 0) {

                months--;

                Calendar previousMonth = (Calendar) current.clone();
                previousMonth.add(Calendar.MONTH, -1);

                days += previousMonth.getActualMaximum(
                        Calendar.DAY_OF_MONTH
                );
            }

            // Agar months negative hain to ek year borrow karenge.
            if (months < 0) {
                years--;
                months += 12;
            }

            System.out.println(
                    "Age: " + years + " years, "
                            + months + " months, "
                            + days + " days"
            );

        } catch (ParseException e) {

            // Agar input dd-MM-yyyy format mein nahi hai
            // to error message display hoga.
            System.out.println(
                    "Invalid date. Please use dd-MM-yyyy format."
            );
        }

        sc.close();
    }
}