import java.util.HashMap;
import java.util.Map;

public class StringProblem {
    public static void main(String str[])
    {
        String s="ab#adbc#";
        char ch[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            if(!map.containsKey(ch[i]))
                map.put(ch[i],1);
            else {
                map.put(ch[i],map.get(ch[i])+1);
            }
        }
        System.out.println(map);
    }
}
