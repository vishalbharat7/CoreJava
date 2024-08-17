package core.java.containers.methods;

import java.util.UUID;

public class MutatorAccessorMethods {

    private String name;

    private UUID studentId;

    private int age;

    private float marks;

    /*#################Java Bean Class##########################
     Java Class with private member variables and setXXX() and getXXX() are called Java Bean class
     Mutator -> setXXX()  or setter methods
     Accessor -> getXXX() or getter methods
    *
    * */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }


    public static void main(String[] args){
        MutatorAccessorMethods mutatorAccessorMethods = new MutatorAccessorMethods();

        mutatorAccessorMethods.setAge(24);
        mutatorAccessorMethods.setMarks(89.45F);
        mutatorAccessorMethods.setName("Vishal Bharat");
        mutatorAccessorMethods.setStudentId(UUID.randomUUID());

        System.out.println("Student data --> " + mutatorAccessorMethods.getName() + mutatorAccessorMethods.getMarks() + mutatorAccessorMethods.getStudentId() + mutatorAccessorMethods.getMarks());
    }
}
