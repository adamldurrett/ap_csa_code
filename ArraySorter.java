import java.util.Arrays;

class ArraySorter{
    public static void main(String[] args){
        int[] myarr = {8,5,1,4,2, 20, 3, 45, 2};
        insertionSort(myarr);
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void selectionSort(int[] arr){
        System.out.println("before:" + Arrays.toString(arr));

        for(int i = 0; i < arr.length-1; i++){
            int min_index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr, min_index, i);
        }
        
        System.out.println("after:" + Arrays.toString(arr));
    }





    public static void insertionSort(int[] arr){
        System.out.println("before:" + Arrays.toString(arr));
        
        for(int i=arr.length-1; i>0; i--){
            for(int j=i-1; j>=0; j--){
                if(arr[i]<arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        System.out.println("after:" + Arrays.toString(arr));
    }
}