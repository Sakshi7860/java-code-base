package DesignPatterns.CreationalDesignPatterns.Singleton.SingletonClass;

public class SingletonPattern {
    private static SingletonPattern singletonPattern=null;
    private SingletonPattern()
    {
        System.out.println("Singleton");
    }

    public static SingletonPattern getInstance()
    {
        if(singletonPattern==null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern == null)
                    singletonPattern = new SingletonPattern();
            }
        }
        return singletonPattern;
    }
}
