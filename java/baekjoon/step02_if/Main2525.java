import java.util.Scanner;

public class Main2525{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        M+=C;
        H+=M/60;
        M=M%60;

        if(H>=24){
            H=H%24;
        }
        System.out.println(H + " " + M);
    }
}