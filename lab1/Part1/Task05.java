import java.util.Scanner;
public class Task05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]= new int[15];
        for(int i =0; i<=15; i++){
            System.out.println("Enter a number between 0 to  9");
            int n =sc.nextInt();
            a[n]++;
        }
        for(int i =0; i<=9; i++){
            System.out.println(i+" was found "+a[i]+" times");
        }
    }
}
