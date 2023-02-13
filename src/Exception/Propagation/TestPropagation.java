package Exception.Propagation;

public class TestPropagation {
    void m() throws Exception {
        throw new Exception("device error");
    }
    void n() throws Exception {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestPropagation obj=new TestPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}
