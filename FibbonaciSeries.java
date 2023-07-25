import java.util.Scanner;

public class FibbonaciSeries {
    static void Fibbonaci(int n){
        int n1=1,n2=1,n3,i;
        System.out.print(0+" "+1);
        for (i=2;i<n;i++){
            n3=n2+n1;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many time you want to print: ");
        int times=sc.nextInt();
        Fibbonaci(times);
    }
    
}
