import java.util.Scanner;

public class AverageOfNnuMbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        if(n<=0){
            System.out.println("cann't found error 😑");
        }
        else{
            while(i<=n){
                sum=sum+i;
                i++;
            }
        System.out.println("Average of these number is: "+(float)sum/n);
        }

    }
}