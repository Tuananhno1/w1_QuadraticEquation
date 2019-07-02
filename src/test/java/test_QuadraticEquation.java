import java.util.Scanner;

public class test_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if( (b*b)-(4*a*c) > 0){
            System.out.println("Phuong trinh co 2 nghiem la: " + quadraticEquation.getRoot1() + " va "+ quadraticEquation.getRoot2());
        }
        if ((b*b)-(4*a*c) == 0){
            System.out.println("Phuong trinh co 1 nghiem la: " + quadraticEquation.getRoot());
        }
        if( (b*b)-(4*a*c) < 0){
            System.out.println("The equation has no roots");
        }
    }
}
