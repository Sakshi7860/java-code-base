package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        Predicate predicate=(x)-> x.toString().startsWith("s");
        System.out.println(predicate.test("Sakshi"));
        Consumer printer = str -> System.out.println(str);
        printer.accept("Welcome");
        printer.accept("JavaInterviewPoint");
        List<Integer> list=Arrays.asList(1,2,3,4);
        list.stream().map(x-> x+10).forEach(x-> System.out.println(x));

    }
}
