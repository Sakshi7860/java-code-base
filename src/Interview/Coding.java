package Interview;

import java.util.Arrays;

public class Coding {
    public static void main(String[] args) {
        int arr[]={0,0,2,0,2,2,1,0,2,0};
        int n=arr.length;
        int i=0;
        int j=0;
        int k=n-1;
        while(j<=k)
        {
            if(arr[j]==1)
                j++;
            else if(arr[j]==0 && i!=j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            else if(arr[j]==0 && i==j)
            {
                i++;
                j++;
            }
            else {
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                k--;
            }

        }
        Arrays.stream(arr).forEach(x-> System.out.println(x));


    }
}
