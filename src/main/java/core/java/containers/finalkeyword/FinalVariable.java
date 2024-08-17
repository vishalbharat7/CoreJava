package core.java.containers.finalkeyword;

import java.util.GregorianCalendar;

public class FinalVariable {

    final int STUDENT_ID; // Blank final variable

    final String STUDENT_NAME;

    final static String STUDENT_GENDER;

    final static String STUDENT_IP;

    FinalVariable(int studentId){        //Initialize Blank final variable in all constructors
        this.STUDENT_ID = studentId;
    }

    FinalVariable(){
        this.STUDENT_ID = 10;
    }

    {
        this.STUDENT_NAME = "Vishal BHarat";
    }

    static{
        STUDENT_GENDER = "MALE";
        STUDENT_IP = "127.0.0.1";
    }

    // static void initalize(){ STUDENT_IP  = "127.0.0.1";} Only static blocks can initialize final static variables

    public static void main(String[] args){
        FinalVariable finalVariable = new FinalVariable();
        // finalVariable.studentId = 10;  Cannot assign a value to final variable 'studentId'
        System.out.println(finalVariable.STUDENT_ID);
    }

}
