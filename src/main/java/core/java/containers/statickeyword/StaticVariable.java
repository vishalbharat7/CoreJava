package core.java.containers.statickeyword;

public class StaticVariable {

    String sstudentName;

    static int studentId = 10;

    void m1(){
        //static int i =10; Only at class level
    }


    public static void main(String[] args){
        // static int stdudent; -->  java: class, interface, enum, or record expected ONLY Class Level variables
        StaticVariable staticVariable = new StaticVariable();
        StaticVariable staticVariable11 = null;
        StaticVariable.studentId =100;
        System.out.println(StaticVariable.studentId);
        System.out.println(staticVariable11.studentId);

        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();

        System.out.println(staticVariable.studentId + " " + staticVariable2.studentId);
        staticVariable.studentId = 120; //Yellow error -> Static member 'core.java.containers.statickeyword.StaticVariable.studentId' accessed via instance reference
        StaticVariable staticVariable3 = new StaticVariable();
        System.out.println(staticVariable.studentId + " " + staticVariable2.studentId + " " + staticVariable3.studentId);
        System.out.println(StaticVariable.studentId);

    }
}
