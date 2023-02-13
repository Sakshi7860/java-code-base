package DesignPatterns.CreationalDesignPatterns.Singleton.Cloning;

public class CloningSingelton implements Cloneable{
    private static CloningSingelton instance = null;

    private CloningSingelton() {
        System.out.println("Singleton");
    }

    public static CloningSingelton getInstance() {
        if (instance == null)
            instance = new CloningSingelton();
        return instance;
    }
    //It breaks the singleton
    /*public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
    //It resolve the issue, only create single object
     public Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
