import java.util.Scanner;

public class Fahrenheit_To_Celsius_Converter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int celsius = 0;
        int fahrenheit = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Please enter a temperature in fahrenheit: ");
            if (in.hasNextInt())
            {
                fahrenheit = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The inputted temperature is " + celsius + " in celsius");

    }
}
