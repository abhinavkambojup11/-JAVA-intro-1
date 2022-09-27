import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str;
        Scanner input  = new Scanner(System.in);
        str = input .nextLine();
        while(!str.equals("XDONE")){
            sb.append(str);
            sb.append(" ");
            str = input .nextLine();
        }
        System.out.println(sb.toString());
    }
}