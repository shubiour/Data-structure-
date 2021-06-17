
import java.util.*;

public class MyReader 
{

    public MyReader() 
    {
   
    }
   

    int readInteger() throws EitaIntegerNoiException{
        Scanner k = new Scanner(System.in);

        int answer = -1;

        String s = k.nextLine();

        if (s.contains(".")) {
            throw new EitaIntegerNoiException("errorss...");
        } 
        else {
            return answer=Integer.parseInt(s);
        }
         }
}
