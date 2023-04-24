import java.util.Arrays;

public class Function_value {
    public static void main(String args[]){

        int a=10;
        int b=20;
        pass(a,b);
        System.out.println("Values not changed " + a +" " +b);
        int[] arr={1,2,3,4,5,6};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void pass(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("New obj created " +a +" " +b);
    }

    static void Change(int[] arra){
         arra[0]=99;
    }
}
