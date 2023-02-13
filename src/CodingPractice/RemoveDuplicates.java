package CodingPractice;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="aabccccdeef";
        Stack<Character> stack =new Stack<>();
        StringBuilder sb=new StringBuilder();
        char ch[]=s.toCharArray();
        stack.push(ch[0]);
        for(int i=1;i<ch.length;i++)
        {
            if(!stack.isEmpty() && ch[i]==stack.peek())
            {
                while(i<ch.length && stack.peek()==ch[i])
                {
                    i++;
                }
                stack.pop();
                i--;
            }
            else
                stack.push(ch[i]);
        }
        while(!stack.isEmpty())
            sb.append(stack.pop());
        System.out.println(sb.reverse().toString());
    }
}