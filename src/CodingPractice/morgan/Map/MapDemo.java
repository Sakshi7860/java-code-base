package CodingPractice.morgan.Map;

import java.util.*;

class Color {
    String name;

    Color(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

public class MapDemo {
    public static void main(String[] args) {
        Map<Color, String> map = new HashMap<>();
        map.put(new Color("RED"), "Red");
        map.put(new Color("Blue"), "Blue");
        map.put(new Color("Green"), "Green");
        System.out.println(map.size());
        System.out.println(map.get(new Color("Blue")));  //hashCode return same for all keys i.e 1

    }
}
