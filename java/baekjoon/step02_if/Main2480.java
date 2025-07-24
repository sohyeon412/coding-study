import java.util.Scanner;

public class Main2480{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();

        int reward=0;

        if(A==B&&B==A){
            reward = 10000 + A * 1000;
        }
        else if(A==B || A==C){
            reward = 1000 + A * 100;
        }
        else if(B==C){
            reward = 1000 + B * 100;
        }
        else{
            int max= Math.max(A, Math.max(B, C));
            reward = max * 100;
        }
        System.out.println(reward);
    }
}