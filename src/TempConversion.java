import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature to be converted to F :");

        float tempC=in.nextFloat();

        float tempF= (tempC * 9/5)+ 32;

        System.out.println("Temp: "+  tempF);

    }
}
