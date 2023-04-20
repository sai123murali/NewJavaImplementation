import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        System.out.println("Largest number of 3: ");
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        //Method 1

//        if(a>b && a>c){
//            System.out.println(a + " a is greater");
//        }else if(b>a && b>c){
//            System.out.println(b + " b is greater");
//        }else{
//            System.out.println(c + " c is greater");
//        }

        //Method 2

//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println("Max number is: " + max);

        //Method 3

        int max= Math.max(c,Math.max(a,b));
        System.out.println("Max number is: " + max);
    }
}
