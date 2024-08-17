package core.java.containers.javaclass;

import java.util.UUID;

public class JavaClass {

    String name;
    UUID studentId;
    int age;
    float marks;

    JavaClass(String name, UUID studentId, int age, float  marks){
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.marks = marks;
    }

    String getName(){
        return this.name;
    }
    float getMarks(){
        return this.marks;
    }

    UUID getStudentId(){
        return this.studentId;
    }

    public static void main(String[] args){
        JavaClass student = new JavaClass("vishal bharat", UUID.randomUUID(), 23,87.56F );
        System.out.println(student.getName() + " " + student.getMarks() + " your Student ID is " + student.getStudentId());
    }
}
