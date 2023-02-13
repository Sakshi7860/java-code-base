package DesignPatterns.CreationalDesignPatterns.Builder;

public class Client {
    public static void main(String str[]) throws Exception {
        Student student=Student.getBuilder().setName("Sakshi").setAge(21).setId(101).setBatchName("ABC").build();
        System.out.println(student);
    }
}
