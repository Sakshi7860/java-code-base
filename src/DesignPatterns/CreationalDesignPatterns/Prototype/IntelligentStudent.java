package DesignPatterns.CreationalDesignPatterns.Prototype;

public class IntelligentStudent extends Student{
    int iq;
    IntelligentStudent() {
    }
    IntelligentStudent(IntelligentStudent student)
    {
        super(student);
        this.iq=student.iq;
    }
    @Override
    public Object clone()
    {
        return new IntelligentStudent(this);
    }
}
