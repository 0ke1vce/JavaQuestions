import java.util.Scanner;

class Bill{
    Scanner sc=new Scanner(System.in);
    long unit;
    double Bill;
    float rate;
    Bill(){
        System.out.println("number of unit you use per day: ");
        long per_day=sc.nextLong();
        System.out.println("so unit used in one month is "+per_day*30);
        unit=per_day*30;
    }
    double Bill_of_Person(){
        System.out.println("rate per unit is: ");
        rate=sc.nextFloat();
        System.out.println("so your total bill will be: ");
        Bill=rate*unit;
        return Bill;
    }

}
public class ElectricityBill {
    public static void main(String[] args) {
        Bill b=new Bill();
        System.out.println(b.Bill_of_Person());

    }
}
