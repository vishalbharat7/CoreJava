package core.java.containers.thiskeyword;

public class ThisClassVariable {

    private String studentName;

    void setStudentName(String studentName){       //Local Variable --> String studentName
        this.studentName = studentName;      //Class level variable --? this.studentName
    }

    void displayStudent(){
        System.out.println(this.studentName);
    }
    void thisMethdo(){
        displayStudent();
        this.displayStudent();
    }

    String getStudentName(){
        System.out.println(this.studentName);
        return studentName;
    }

    public static  void main(String[] args){
        ThisClassVariable thisClassVariable = new ThisClassVariable();
        thisClassVariable.setStudentName("vishal");
        thisClassVariable.thisMethdo();
    }
}
