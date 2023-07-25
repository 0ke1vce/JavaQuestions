import java.util.Scanner;

public class Factorial {
    static int findFactorialRecursive(int fac){
        if(fac<0){
            return -1;
        }
        else if(fac==0 || fac==1){
            return 1;
        }
        else{
            return fac*findFactorialRecursive(fac-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int factorial_Of=sc.nextInt();
        System.out.println(findFactorialRecursive(factorial_Of));
    }
    
}
