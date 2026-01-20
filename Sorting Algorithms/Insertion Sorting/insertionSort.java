import java.util.Arrays;

public class insertionSort{
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,8,11,8,45,22,65,32,87,54,99,12,34,21,56};

        for (int i = 0; i < arr.length; i++){
            int chkindex = i;
            int val = arr[i];

            for (int j=i-1; j > -1; j--){
                if ( arr[j] > val){
                    arr[j+1] = arr[j];
                    chkindex = j;
                }
                else {
                    break;
                }
            }
        arr[chkindex] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
}