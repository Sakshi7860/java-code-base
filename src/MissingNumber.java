public class MissingNumber {
    public static void main(String str[])
    {
        int arr[]={1,2,3,4,6,7,8,9,10};
        int n=10;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int totalSum=0;
        totalSum=(n*(n+1))/2;
        int missingNum=totalSum-sum;
        System.out.println(missingNum);
    }
}
