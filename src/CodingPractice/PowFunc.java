package CodingPractice;

public class PowFunc {
    public double myPow(double x, int n)
    {
        if(n==0)
            return 1;
        double halfPower=myPow(x,n/2);
        double pow=halfPower*halfPower;
        if(n%2==0)
            return pow;
        else if(n>0)
            return x*pow;
        else
            return (1/x)*pow;
    }
    public static void main(String s[])
    {
        PowFunc powFunc=new PowFunc();
        System.out.println(powFunc.myPow(2,-4));

    }
}
