import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

    Scanner in = new Scanner(System.in);
        double meter = 0;
        double inches = 0;


        System.out.println("Enter your distance in Meters: ");

        if (in.hasNextDouble())
        {
            meter = in.nextDouble();
        }
        else
        {
            System.out.println("Not a valid input");
            System.exit(0);
        }

        inches = 39.37 * meter;
        int miles = (int) (inches/63360);
        int feet = (int) (inches-miles*63360)/12;
        double inchesLeft = inches-((miles*63360)-(feet*12));

        System.out.println("Meters converted equals: " +miles+" Miles " +feet+" Feet " +inches+" Inches 540");



    }
}