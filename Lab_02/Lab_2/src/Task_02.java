/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
import java.util.Scanner;
public class Task_02 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            System.out.print( "You have entered  ");
            for(int j=0; j<=i; j++)
        {
            System.out.print(a[j]+", ");
        } 
            System.out.println();
        }
        
    }
}
