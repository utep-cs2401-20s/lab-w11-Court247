import javax.sound.midi.SysexMessage;
import java.util.Arrays;

public class NewSort {
    int part(int[] A, int beg , int end) {//partition for quick sort
        int i = beg + 1;
        int pivot = A[beg] ;            //make the first element as pivot element.
        for(int j =beg + 1; j <= end ; j++ )  { //for loop to array array by putting <pivot on left and >pivot on right
            if ( A[ j ] < pivot) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i += 1;
            }
        }
        int temp = A[beg];//put the pivot element in its proper place.
        A[beg] = A[i-1];
        A[i-1] = temp;
        return i-1;   //return the position of the pivot
    }

    void recursiveQuickSort(int[] A, int low, int high) {

        if(A.length == 1){ //if length is one aka. already sorted
            return;
        }
        else if (low < high) {
            int par = part(A, low, high);
            recursiveQuickSort(A, low, par-1);
            recursiveQuickSort(A, par+1, high);
        }
    }

    void mergeArr(int[]A, int[] arrL, int[] arrR) {
        int i = 0;
        int j = 0;
        int k = 0;

        int fullLength = arrL.length + arrR.length;
        A = new int[fullLength]; //new array is initialized to length of both arrays

        //start merging sorted subarrays.
        while (i < arrL.length && j < arrR.length) {
            if (arrL[i] < arrR[j]) {
                A[k++] = arrL[i++];
            } else {
                A[k++] = arrR[j++];
            }

        }
        while (i < arrL.length) {
            A[k++] = arrL[i++];
        }
        while (j < arrR.length) {
            A[k++] = arrR[j++];
        }

        System.out.println(Arrays.toString(A));
    }


    void newSorting(int[] A, int size){

        if(A.length <= size){
            recursiveQuickSort(A, 0,A.length-1);
        }
        else{
            int n = A.length;
            int mid = (n+1)/2;

            int[] arrL = new int [mid];
            int[] arrR = new int [n - arrL.length];

            //populate arrays
            for(int i = 0; i<n;i++){
                if(i<arrL.length){
                    arrL[i] = A[i];
                }else{
                    arrR[i - arrL.length] = A[i];
                }
            }

            newSorting(arrL,size);
            newSorting(arrR, size);
            System.out.println(Arrays.toString(arrL));
            System.out.println(Arrays.toString(arrR));
            mergeArr(A, arrL,arrR);

        }
    }
}
