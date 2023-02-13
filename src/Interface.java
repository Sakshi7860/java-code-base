interface Scaler{
    void myMethod();
    void getInfo();
}


abstract class IB implements Scaler{

    void getData(){
        System.out.println("IB");
    }
}

public class Interface extends IB{
    public void myMethod(){
        System.out.println("InterviewBit");
    }

    public void getInfo(){
        System.out.println("Scaler");
    }

    public static void main(String[] args){
        IB obj = new Interface();
        obj.getInfo();
    }
}

