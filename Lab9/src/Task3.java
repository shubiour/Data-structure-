/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiour Shuvo
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        print(0, a);
    }
    public static  void print(int i , int a[]){
    if(i<a.length){
        System.out.print(a[i]+ " ");
        print(i+1, a);
    }
    }
    
}
