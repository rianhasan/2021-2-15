import java.util.Arrays;
import java.util.Scanner;

/**
ريان حسن
 */
public class Merging {
    Scanner input=new Scanner(System.in);
    int [] arr=new int[5];
    int [] array=new int [5];
    public void insertElements()
    {
        System.out.println("Enter array1 elements");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();
        }
    }
    public void insertElements1()
    {
        System.out.println("Enter array2 elements");
        for (int i = 0; i <arr.length ; i++) {
            array[i]=input.nextInt();
        }
    }
    int [] a=new int [arr.length+array.length];
    public void MergingArray()
    {

        for (int i = 0; i < arr.length; i++) {
            a[i]=arr[i];
            a[i+arr.length]=array[i];
            }
        System.out.print(Arrays.toString(a));

        }
     public void searchElement(int k)
     {
         for (int i = 0; i <a.length ; i++) {
             if(a[i]==k)
             {
                 System.out.println("Element found in index :"+i);break;
             }
             else
                 System.out.println("Element is not found");
         }}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        Merging m=new Merging();
        m.insertElements();
        System.out.println(Arrays.toString(m.arr));
        m.insertElements1();

        System.out.println(Arrays.toString(m.array));
        Arrays.sort(m.a);
        System.out.println("Elements of Merging Array");
        //System.out.println(Arrays.toString(m.a));
        m.MergingArray();
        System.out.println("enter the element you want to search");
        int c=s.nextInt();
        m.searchElement(c);

    }

}
