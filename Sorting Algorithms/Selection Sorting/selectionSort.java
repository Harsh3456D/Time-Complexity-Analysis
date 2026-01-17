
import java.util.Arrays;


public class selectionSort{
    public static void main(String[] args){
        int arr[] = {3,2,4,5,8,11,8,45,22,65,32,87,54,99,12,34,21,56};

        for (int i = 0; i < arr.length; i++){
            int subindex = i;
            for (int j=i+1 ; j < arr.length; j++){
                if (arr[j] < arr[subindex]){
                    subindex = j;
                }
            }
        int temp= arr[subindex];
        arr[subindex] = arr[i];
        arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}

