import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        System.out.println("Switch case");

        Scanner in=new Scanner(System.in);
        String St=in.next();

        switch (St) {
            case "Apple" -> System.out.println("Its a apple");
            case "Banana" -> System.out.println("Its banana");
            case "Mango" -> System.out.println("Its Mango");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
