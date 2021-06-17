import java.util.*;
public class CustomEXception{
    
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        MyException r = new MyException();
        try{
            int a =sc.nextInt();
            r.method();
        }
        catch(Exception e){
            System.out.println("Exception occured: "+e);
        }
    }
}
class MyException extends Exception{
    void method(){ 
        if(a<10){
            throw new InvalidAgeException("it's less then 10");
        }
    }
    void toString(){
        System.out.println("Custom");
    }
}