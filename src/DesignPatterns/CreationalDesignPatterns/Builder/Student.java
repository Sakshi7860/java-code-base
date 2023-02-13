package DesignPatterns.CreationalDesignPatterns.Builder;

public class Student {
    int id;
    String name;
    int age;
    String batchName;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    private Student(BuilderClass builderClass) throws Exception {
        //validations
        if(builderClass.getAge()>22)
            throw new Exception("Id should be less than 22");
        this.id=builderClass.getId();
        this.name=builderClass.getName();
        this.age=builderClass.getAge();
        this.batchName=builderClass.getBatchName();
    }
    //Static method So Builder class is also make static
    public static BuilderClass getBuilder()
    {
        return new BuilderClass();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }


    public static class BuilderClass {
        int id;
        String name;
        int age;
        String batchName;

        public int getId() {
            return id;
        }

        public BuilderClass setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public BuilderClass setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public BuilderClass setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatchName() {
            return batchName;
        }

        public BuilderClass setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public Student build() throws Exception {
            return new Student(this);
        }
    }
}
