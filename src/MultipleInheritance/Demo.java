package MultipleInheritance;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

interface A
{
   public void sum();
}
interface B
{
    public void sum();
}
class C implements A,B{

    @Override
    public void sum() {
        System.out.println("C");
    }
}

class Demo
{
    public static void main(String[] args) {
        
    }
}
