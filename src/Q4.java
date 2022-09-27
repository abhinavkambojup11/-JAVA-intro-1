import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int [][]arr={{1,1,1},{2,2,2},{3,4,5}};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Sum of row "+ (i+1) + " is: " + sum);
        }
        for(int i=0;i<arr[0].length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println("sum of column "+ (i+1) + " is: " + sum);
        }
    }
}