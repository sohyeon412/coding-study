import java.util.Scanner;

public class MainMul100{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();

        int B1 = B.charAt(2) - '0';
        int B2 = B.charAt(1) - '0';
        int B3 = B.charAt(0) - '0';

        System.out.println(A * B1);
        System.out.println(A * B2);
        System.out.println(A * B3);
        System.out.println(A * Integer.parseInt(B));

    }
}