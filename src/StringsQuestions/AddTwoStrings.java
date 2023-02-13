package StringsQuestions;

public class AddTwoStrings {
    public static void main(String[] args) {
        String num1="584";
        String num2="18";
        StringBuilder sb=new StringBuilder();
        int len1=num1.length()-1;
        int len2=num2.length()-1;
        int carry=0;

        while(len1>=0 && len2>=0)
        {
            int n1=Integer.parseInt(String.valueOf(num1.charAt(len1)));
            int n2=Integer.parseInt(String.valueOf(num2.charAt(len2)));
            int sum=n1+n2+carry;
           // System.out.println("sum: "+sum);
            int mod=sum%10;
            carry=sum/10;
            sb.append(mod);
            len1--;
            len2--;
        }
        //System.out.println("print: "+sb.reverse());
        System.out.println("carry: "+carry);
        System.out.println("len1: "+len1);
        System.out.println("len2: "+len2);
        while(len1>=0)
        {
            int number=Integer.parseInt(String.valueOf(num1.charAt(len1)))+carry;
            int mod=number%10;
            carry=number/10;
            sb.append(mod);
            System.out.println(sb);
            len1--;
        }
        while(len2>=0)
        {
            int number=Integer.parseInt(String.valueOf(num2.charAt(len2)))+carry;
            int mod=number%10;
            carry=number/10;
            sb.append(mod);
            len2--;
        }
        System.out.println(sb.reverse().toString());
    }
}
