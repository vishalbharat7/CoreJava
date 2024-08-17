package core.java.containers.thiskeyword;

public class ThisClassMethod {

    String studentName;

    void dispalyStudentName(){
        System.out.println(this.studentName);
    }

    void setStudentName(String studentName){
        this.studentName = studentName;
    }
     void thisMethod(){
        dispalyStudentName();
        this.dispalyStudentName();
     }

     public static void main(String[] args){
        ThisClassMethod thisClassMethod = new ThisClassMethod();
        thisClassMethod.setStudentName("vishal bharat");
        thisClassMethod.thisMethod();
     }
}
