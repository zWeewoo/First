package Basic_Concepts;

import java.util.Scanner;

public class Converter {
    static double Converting(double Celsius){
        return (9.0 / 5) * Celsius + 32;
    }

    public static void main(String[] args) {
        System.out.print("Input the Celsius degree you wish to convert: ");
        Scanner Input = new Scanner(System.in);

        double Degree = Input.nextDouble();
        System.out.println("Converting " + Degree + " Celsius to Fahrenheit...");

        double Converted = Converting(Degree);
        System.out.println("Converted: " + Degree + " Celsius is equal to " + Converted + " Fahrenheit");
    }
}
