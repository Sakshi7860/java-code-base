package DesignPatterns.CreationalDesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery {
    Map<String,Student> map=new HashMap<>();
    public void addRegistry(String key,Student student)
    {
        map.put(key,student);
    }
    public Student getPrototype(String key)
    {
        return map.get(key);
    }

}
