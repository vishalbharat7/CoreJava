package core.java.containers.object;

import java.io.ObjectStreamException;

public class ObjectClass {

    int studentId;

    String studentName;

    ObjectClass(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "json{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public static void main(String[] args){

        ObjectClass objectClass = new ObjectClass(123, "Vishal");
        System.out.println(objectClass);
    }
}
