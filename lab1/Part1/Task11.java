import java.util.*;
public class Task11{
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the digits");
        int q = sc.nextInt();
        test t = new test();
        t.allDigitsOdd(new int [q]);
        
    }
}
class test{
    public void allDigitsOdd(int n[]){
        Scanner sc = new Scanner(System.in);
        String s ="true";
        String s1 ="false";
        boolean cheak = true;
        for(int i =0; i<n.length; i++){
            n[i] = sc.nextInt();
            if(n[i]%2 == 0){
                cheak= false;
            }
        }
        if(cheak == true){
            System.out.println("true");
        }
        else if (cheak == false){
            System.out.println("false");
        }
    }
    
}