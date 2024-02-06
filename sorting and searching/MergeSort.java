class  MergeSort{
    public static void main(String[] args){
        int [] arr = {9,3,5,11,67,-2,5,19,2};

    }

    int [] merge_sort(int[] arr){
        int start = 0;
        int end = arr.length;
        int mid = (start + end)/2;

        if(arr.length>2){

        }
        

    }

    int [] merge_arrays(int [] arr_left, int[] arr_right){
        int [] merged_arr = new int [arr_left.length + arr_right.length];

        int left_i = 0;
        int right_i = 0;

        while(left_i + right_i < merged_arr.length){
            int index = left_i + right_i;
            if(left_i >= arr_left.length){
                merged_arr[index] = arr_right[right_i];
                right_i++;
            }
            else if(right_i >= arr_right.length){
                merged_arr[index] = arr_left[left_i];
                left_i++;
            }
            else{
                if(arr_left[left_i] < arr_right[right_i]){
                    merged_arr[index] = arr_left[left_i];
                    left_i++;
                }
                else{
                    merged_arr[index] = arr_right[right_i];
                    right_i++;
                }

            }
        }
        return merged_arr;
    }
}