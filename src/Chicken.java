import java.util.Scanner;
public class Chicken {

    public static void main(String[] args) {

        int age = -1;
        String firstName;
        String favouriteFood;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        while (age < 0 || age > 140) {
            try {
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }

        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter your favourite food:");
        favouriteFood = scanner.nextLine();

        System.out.println("Here is your personal information:" + "\nFirst Name: " + firstName + "\nAge: " + age + "\nFavourite Food: " + favouriteFood);

        int chicken = -1;
        System.out.println("Here is a maths question:" + "\nMing raises chickens and rabbits on his farm. Ming has a total of 10 animals in a cage. They have a total of 28 legs. How many chickens are there?");
        while (chicken < 0 || chicken > 10) {
            try {
                chicken = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number of chickens");
            }

        }
        boolean reset = true;
        int tries = 0;

        if (chicken == 6) {
            System.out.println("Congratulations you have been certified to have reached the mathematics level of a Chinese first grader.");
            reset = false;
        }
        else {
            System.out.println("You are not very smart are you.");
            reset = true;
        }

        while (reset == true){
            chicken = -1;
            System.out.println("Enter your answer again.");
            tries ++;
            while (chicken < 0 || chicken > 10) {
                try {
                    chicken = Integer.parseInt(scanner.nextLine());
                    if (chicken == 6) {
                        reset = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number of chickens");

                }

            }
        }
        if (chicken == 6 && tries < 4) {
            System.out.println("Congratulations you have been certified to have reached the mathematics level of a Chinese first grader.");
            reset = false;
        }
        else {
            System.out.println("It took you way too many tries.");
            reset = false;
        }


    }

}
