import com.sun.imageio.plugins.common.InputStreamAdapter;

import java.util.*;
import java.util.stream.Collectors;

public class DemoMain {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    DemoMain(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void main(String args[])
    {
        Optional<Integer> val=Optional.ofNullable(null);
        System.out.println(val);
        DemoMain demo1=new DemoMain("Ram",10);
        DemoMain demo2=new DemoMain("Sham",20);
        List<DemoMain> list1=new ArrayList<>();
        list1.add(demo1);
        list1.add(demo2);
//        DemoMain demo3=new DemoMain("dharm",20);
//        DemoMain demo4=new DemoMain("sita",40);
//        List<DemoMain> list2=new ArrayList<>();
//        list2.add(demo3);
//        list2.add(demo4);
//        List<List<DemoMain>> result=new ArrayList<>();
//        result.add(list1);
//        result.add(list2);
//        Map<Integer,Long> map=list1.stream().collect(Collectors.groupingBy(x-> x.getAge(),Collectors.counting()));
//        System.out.println(map);
//        List<String> namelist=result.stream().flatMap(x->x.stream()).map((x->x.name)).collect(Collectors.toList());
//        System.out.println(namelist);

//        List<String> list3=Arrays.asList("1 sakshi","4","2","3","6");
//        boolean val=list3.stream().anyMatch(x-> x.startsWith("1"));
//        System.out.println(val);
//        Optional<String> val=list3.stream().reduce((a,b)->{return a+b;});
//        System.out.println(val.get());

        //System.out.println("Hell IntelliJ");
    }
}
