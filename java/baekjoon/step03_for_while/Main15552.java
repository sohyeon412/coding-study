import java.util.Scanner;

public class MAin15552 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i= 0; i<T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(a+b).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}
