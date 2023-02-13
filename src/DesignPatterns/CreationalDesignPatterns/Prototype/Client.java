package DesignPatterns.CreationalDesignPatterns.Prototype;

import DesignPatterns.CreationalDesignPatterns.Enum.RegistryEnum;

public class Client {
    public static void main(String str[])
    {
        Student student= new Student();
        student.setBatchName("Feb22");
        student.setAveragePSP("92");
        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setBatchName("Feb22");
        intelligentStudent.setAveragePSP("92");
        intelligentStudent.iq=99;

        StudentRegistery registryClass=new StudentRegistery();
        registryClass.addRegistry(RegistryEnum.GETAVERAGEPSP.getValue(),student);
        registryClass.addRegistry(RegistryEnum.GETINTELLIGENT.getValue(), intelligentStudent);
        Student student1=(Student) registryClass.getPrototype(RegistryEnum.GETAVERAGEPSP.getValue()).clone();
        student1.setName("Sakshi");
        student1.setId(101);
        System.out.println(student1);
        Student student2=(Student) registryClass.getPrototype(RegistryEnum.GETINTELLIGENT.getValue()).clone();
        student2.setName("sakshi2");
        student2.setId(102);
        System.out.println(student2);

    }
}
