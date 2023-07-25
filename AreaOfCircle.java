import java.util.Scanner;

class Circle {
    /**
     * @return
     */
    public double area() {
        Scanner sc = new Scanner(System.in);
         int rad = sc.nextInt();
        return  Math.PI * rad * rad;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.area());
    }
            
}