public class MissingInteger {
    public static int findMissing(int A[])
    {
        int i=0;
        int n=A.length;
        while(i<n)
        {
            int index=A[i]-1;
            if(A[i]==i+1 || A[i]<=0 || A[i]>n || A[i]==A[index])
                i++;

                int temp = A[index];
                A[index] = A[i];
                A[i] = temp;


        }
        for(int j=0;j<n;j++)
        {
            if(A[j]!=j+1)
                return j+1;
        }

        return n+1;
    }
    public static void main(String s[])
    {
        int A[]={1,2,3};
        System.out.println(findMissing(A));

    }
}
