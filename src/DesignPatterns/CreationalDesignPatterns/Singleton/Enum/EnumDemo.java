package DesignPatterns.CreationalDesignPatterns.Singleton.Enum;

public class EnumDemo {
    public static void main(String s[])
    {
        /*List<Integer> list= new ArrayList<>();
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println("val1: "+singleton.getValue());
        //singleton.setValue(2);
        System.out.println("val2: "+singleton.getValue());*/
        SingletonEnum singletonEnum1=SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2=SingletonEnum.INSTANCE;
        System.out.println(singletonEnum1.hashCode());
        System.out.println(singletonEnum2.hashCode());
        //System.out.println(SingletonEnum.INSTANCE);


    }
}
