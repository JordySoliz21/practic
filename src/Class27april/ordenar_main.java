package Class27april;

import java.util.Arrays;
import java.util.Scanner;

public class ordenar_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];        
        for (int i = 0; i < 3; i++) {
         System.out.println("Ingrese el numero en la posicion "+(i+1)+" : ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(arr));
        System.out.println("");
        sort(arr);
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quicksort(arr, 0, arr.length - 1);
    }
    private static void quicksort(int[] arr, int low, int high) {
        int i = low, j = high;
        int pivot = arr[low];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }    
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(arr, low, j);
        }
        if (i < high) {
            quicksort(arr, i, high);
        }
	}
}
