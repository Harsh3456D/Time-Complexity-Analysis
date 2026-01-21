import java.util.Arrays;

public class countingSort{
    public static void CountingSort(int[] arr) {
        
        if (arr.length == 0) return;

        int maxVal = arr[0];
        for (int num: arr){
            if (num > maxVal){
                maxVal = num;
            }
        }

        int[] count = new int[maxVal + 1];

        for (int num: arr){
            count[num]++;
        }

        int index=0;
        for (int i=0; i < count.length; i++){
            while (count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] myarr = {3, 2, 4, 5, 8, 11, 8, 45, 22, 65, 32, 87, 54, 99, 12, 34, 21, 56};
        CountingSort(myarr);
        System.err.println(Arrays.toString(myarr));
    }

}
