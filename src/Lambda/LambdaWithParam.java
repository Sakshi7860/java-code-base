package Lambda;

@FunctionalInterface
interface Practice
{
    int add(int a, int b);
}
public class LambdaWithParam {
    public static void main(String[] args) {
        //1st way
        //Practice practice=(a,b) -> {return (a+b);};

        //Second way
        Practice practice=(a,b) -> (a+b);
        System.out.println(practice.add(10,20));

    }

}
