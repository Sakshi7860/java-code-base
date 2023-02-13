package Interview;

import java.util.Arrays;

public class subarrayReverse {
    public static void reverse(int arr[], int start, int end) {
        int i = start;
        int j = end;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
        int count = n / k;
        int i=0;
        int j=i+k-1;
        while(count>0)
        {
            reverse(arr,i,j);
            i=j+1;
            j=i+k-1;
            count--;
        }
        reverse(arr,i,n-1);
        Arrays.stream(arr).forEach(x-> System.out.println(x));


    }
}
