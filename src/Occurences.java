import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        System.out.println("Occurence no: ");
        int occurance = in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem == occurance){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
