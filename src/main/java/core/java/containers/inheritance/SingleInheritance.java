package core.java.containers.inheritance;

public class SingleInheritance {

    public static void main(String[] args){
        SuperClass superClass =  new SubClass();
        System.out.println(superClass.subtract(20, 10));
    }
}

class SuperClass{
    int StudentId;
    String StudentName;

    SuperClass(int studentId, String studentName){
        this.StudentId =   studentId;
        this.StudentName = studentName;
    }

    int add(int number1, int number2){
        return number1 + number2;
    }

    int add(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    int subtract(int number1, int number2){
        System.out.println("Ïnside Super Class");
        return number1 - number2;
    }
}

class SubClass extends SuperClass{

    SubClass(){
        //int i=10; Call to 'super()' must be first statement in constructor body
        super(124, "Vishal");
    }

    int subtract(int number1, int number2){
        System.out.println("Ïnside Subclass");
        return number2 - number1;
    }
}
