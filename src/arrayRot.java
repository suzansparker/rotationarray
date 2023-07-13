import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class arrayRot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateArray(array,0, array.length-1);
        rotateArray(array,0,k-1);
        rotateArray(array,k, array.length-1);

        for(int result : array)
        {
            System.out.print(result+" ");
        }

    }
    public static void rotateArray(int[] array,int start,int end)
    {
        int i = start;
        int j = end;
        while(i<j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}