package core.java.containers.statickeyword;

public class StaticMethod {

    static String  studentName = "vishal";

    int studentId;

    static void display(){
        // int i = studentId; // Non-static field 'studentId' cannot be referenced from a static context
        studentName = "vishal bharat"; //Static variables are allowed
        System.out.println(studentName); //Only static variables are allowed, No error
    }

    public static void main(String[] args){
        display();
        StaticMethod.display();
    }
}