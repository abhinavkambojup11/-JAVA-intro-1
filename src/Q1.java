import java.util.Scanner;

public class Q1 {
    static String firstName = "Abhinav";
    static String lastName = "Kamboj";
    static int age = 22;
    private static void print(){
        System.out.println("Inside static method");
        System.out.println("Abhinav Kamboj 22");
    }
    public static void main(String[] args) {
        System.out.println("Inside main method");
        System.out.println(firstName + " " + lastName + " " + age);
        print();
    }
    static{
        System.out.println("Inside static block");
        System.out.println("Abhinav kamboj 22");
    }
}