/**
  ريان حسن
 */
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Task3 {
   

    public int repeatedElement(int[]array)
    {
        int n=array.length;
        int max_int=n-1;
        int sum=(max_int*(max_int+1))/2;
         int array_sum=0;
        for (int i = 0; i <n ; i++) {
         array_sum+=array[i];
        }
        return (array_sum-sum);
    }
    public void RepeatingElements(int []array,int n)
    {
        for (int i = 0; i < n; i++) {
          if(array[Math.abs(array[i])]>0)
              array[Math.abs(array[i])]= -array[Math.abs(array[i])];
            else
              System.out.println(Math.abs(array[i]));
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Task3 t=new Task3();
        int []arr={2,1,3,1};
        System.out.println(t.repeatedElement(arr));
        System.out.println(" function the Repeated element of an array");
        System.out.println("Enter the size of array and ");
        int n=input.nextInt();
        if(n<6)
        {
            System.out.println( "size should be greater than 5");}
            else {
                int[] array=new int[n];
            System.out.println("Enter element of array");
            for (int i = 0; i < n; i++) {
                array[i]=input.nextInt();

            }
            t.RepeatingElements(array,n);
    }}



}
