package core.java.containers.abstractclass;

public abstract class  AbstractClass {

    void concreteMethod(){
        System.out.println("Abstract Class allows zero or more Concrete Methods");
    }

    abstract void abstractMethod();
/*  ##################### Abstract Class ########################
    Abstract class is a java class, it able to allow zero or more no of concrete methods and zero or more no of abstract methods.

    Note: To declare abstract classes, it is not at all mandatory condition to have at least one abstract method, we can declare
    abstract classes with 0 no of abstract methods,but, if we want to declare a method as an abstract method then the respective class
    must be abstract class.

    Abstract classes are able to provide more sharability when compared with classes.

    ####################### Interview Question #######################
    Q.What are the differences between Concrete Classes and Abstract Classes?
    Ans. 1) Classes are able to allow only concrete methods.
            Abstract classes are able to allow both concrete methods and abstract methods.
         2) To declare concrete classes, only, 'class' keyword is sufficient.
            To declare abstract classes we need to use 'abstract’ keyword along with class keyword.
         3) For classes, we are able to create both reference variables and objects,
            For abstract classes, we are able to create only reference variables; we are unable to create objects.
         4) Concrete classes will provide less sharability.
            Abstract classes will provide more sharability.

*/


    public static void main(String[] args){
        //AbstractClass abstractClass = new AbstractClass();  <--- Error 'AbstractClass' is abstract; cannot be instantiated
        AbstractClass abstractClassNull = null; // <-- No Error AbstractClass can be referenced to Null object

        AbstractClass abstractClass = new SubAbstractClass();
        abstractClass.concreteMethod();
        abstractClass.abstractMethod();

        SubAbstractClass subAbstractClass = new SubAbstractClass();
        System.out.println(" ");
        subAbstractClass.abstractMethod();
        subAbstractClass.concreteMethod();
        //abstractClass.subClassMethod();   //Error
        subAbstractClass.subClassMethod();
    }
}
