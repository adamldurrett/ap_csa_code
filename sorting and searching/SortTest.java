public class SortTest{
    public static void main(String[] args) {
        int [] arr = {4,8,12,1,-4,99};

        Sorts sorter = new Sorts();
        sorter.MergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }

    static void printArr(int [] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int [] selectionSort(int[] arr) {
        int [] temp = arr.clone();
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(temp[j] < temp[min]){
                    min = j;
                }
            }
            int temp_num = temp[i];
            temp[i] = temp[min];
            temp[min] = temp_num;
        }
        return temp;
    }
}