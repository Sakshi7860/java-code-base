package CodingPractice.morgan.exception;

public class DemoException {
    public static String exceptionMethod()
    {
        try
        {
            int a=10/0;
            return "10";
        }
        catch(ArithmeticException exception)
        {
            return "Catch";
        }
        finally {
            return "Finally";
        }
    }
    public static void main(String[] args) {
        System.out.println(exceptionMethod());
    }
}
