import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of radius");
        int r=sc.nextInt();
        System.out.println("Enter 1 for Area & 2 for Circumference");
        int n=sc.nextInt();
        switch (n){
            case 1:
                area(r);
                break;
            case 2:
                circumference(r);
                break;
            default:
                break;
        }
    }
    public static void area(int r){
        double ans = Math.PI*r*r;
        System.out.println("Area of circle is:" + ans);
    }

    public static void circumference(int r){
        double ans=Math.PI*2*r;
        System.out.println("Circumference of circle is:" + ans);
    }
}