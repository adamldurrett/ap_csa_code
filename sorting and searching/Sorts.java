class Sorts{
    Sorts(){
    }

    int [] InsertionSort(int [] arr){
        int [] copy = arr.clone();
        for(int i = 0; i < copy.length; i++){
            int min_index = i;
            for(int j = 0; j < copy.length; j++){
                if(copy[j] < copy[min_index]){
                    min_index = j;
                }
            }
            int temp = copy[min_index];
            copy[min_index] = copy[i];
            copy[i] = temp;
        }
        return copy;
    }

    void Merge(int [] arr, int left, int middle, int right){
        // Breaking array in half into two arrays
        int len_left = middle - left + 1;
        int len_right = right - middle;

        int [] left_arr = new int[len_left];
        int [] right_arr = new int[len_right];

        for(int i = 0; i < len_left; i++){
            left_arr[i] = arr[i];
        }
        for(int i = len_left; i < len_right; i++){
            right_arr[i-len_left] = arr[i+len_left];
        }
        // done breaking in half.

        int r_i = 0, l_i = 0;
        int arr_i = 0;

        while(r_i < len_right && l_i < len_left){
            if(left_arr[l_i] <= right_arr[r_i]){
                arr[arr_i] = left_arr[l_i];
                l_i++;
            }
            else{
                arr[arr_i] = right_arr[r_i];
                r_i++;
            }
            arr_i++;
        }

        while(r_i < len_right){
            arr[arr_i] = right_arr[r_i];
            arr_i++;
            r_i++;
        }

        while(l_i < len_left){
            arr[arr_i] = left_arr[l_i];
            arr_i++;
            l_i++;
        }
    }

    void MergeSort(int arr[], int left_i, int right_i){
        printArray(arr);
        if(left_i < right_i){
            int middle_i = left_i + (right_i - left_i) / 2;

           MergeSort(arr, left_i, middle_i);
           MergeSort(arr, middle_i + 1, right_i);

           Merge(arr, left_i, middle_i, right_i);
        }
    }


    void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}