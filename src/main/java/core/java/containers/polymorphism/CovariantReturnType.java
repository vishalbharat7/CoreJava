package core.java.containers.polymorphism;


class SuperClass1{

    Object covariantReturnTypeMethod(){
        System.out.println("This is a Object type return method");
        return null;
    }

}

class SubClass1 extends SuperClass1{

    @Override
    String covariantReturnTypeMethod(){
        System.out.println("This is a String type return method");
        return null;
    }
}

public class CovariantReturnType {

    public static void main(String[] args){
        SuperClass1 superClass1 = new SubClass1();
        superClass1.covariantReturnTypeMethod();
    }
}
