import kotlin.jvm.Synchronized;

public class Singleton {
    private static final Singleton instance=new Singleton();
    private Singleton()
    {
        System.out.println("singleton class");
    }
    public static Singleton getInstance()
    {
        return instance;
    }
}
