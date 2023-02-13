package CodingPractice.morgan;

public class TestInner {
    public static void main(String[] args) {
        TestInner testInner=new TestInner();
        //InnerClass innerClass=new TestInner.InnerClass; // for static class
        InnerClass innerClass=testInner.new InnerClass();

    }
   /* private static class InnerClass
    {

    }*/
    private class InnerClass
   {

   }
}
