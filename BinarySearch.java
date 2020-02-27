import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch 
{
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid])
            {
                System.out.println("lo:" + lo + " hi:" + hi + " mid:" + mid);
                hi = mid - 1;
            }
            else if(key > a[mid])
            {
                System.out.println("lo:" + lo + " hi:" + hi + " mid:" + mid);
                lo = mid + 1;
            }
            else 
            {
                System.out.println("lo:" + lo + " hi:" + hi + " mid:" + mid);
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] list = new int[8];
        for(int i = 0 ; i < list.length ; i++)
        list[i] = in.nextInt();
        Arrays.sort(list);

        for (int e : list)
            System.out.print(e + " ");
        System.out.println("");

        for(int e : list)
            System.out.print(e + " ");
        System.out.println("");

        System.out.println("loc " + rank(2, list));
    }
}