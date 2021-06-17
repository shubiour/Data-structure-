/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiour Shuvo
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a[] = {40, 10, 30, 50, 20, 70, 90, 60, 80, 100};
        int b[] = {40, 10, 30, 50, 20, 70, 90, 60, 80, 100};
        int c[] = {40, 10, 30, 50, 20, 70, 90, 60, 80, 100};
        Tester s1 = new Tester();
        s1.SelectionSort(a);
        System.out.println();
        s1.BubbleSort(b);
        System.out.println();
        s1.InsertSort(c);
    }

    public static void SelectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minLoc = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minLoc = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[minLoc] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void BubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int temp;
            for (int j = 1; j < (a.length) - i; ++j) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void InsertSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > x) {
                a[j+1]  = a[j];
                j--;
            }
            a[j + 1] = x;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
