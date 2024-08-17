package core.java.containers.javainterface;


public class InterfaceImplementationClass implements JavaInterface{

    @Override
    public void printAge(){
        System.out.println("Interface age is " + JavaInterface.age);
    }
    void implementationClassMethod(){
        System.out.println("Interface cannot access implementation Class Method");
    }
    /*
      ################Procedure to Use interfaces in Java applications#################
          1) Declare an interface with "interface" keyword.
          2) Declare variables and methods in interface as per the requirement.
          3) Declare an implementation class for interface by including "implements" keyword.
          4) Provide implementation for abstract methods in implementation class which are declared in interface.
          5) In main class, in main() method, create object for implementation class ,but, declare reference variable either for interface or for implementation class.
          6) Access interface members.

          Note: If declare reference variable for interface then we are able to access only interface members, we are unable to access
          implementation class own members. If we declare reference variable for implementation class then we are able to access both
          interface members and implementation class own members.

       ######################Interview Question #################################################
       Q.What are the differences between Class, abstract Classes and Interface?
       ans. 1) Class is able to allow concrete methods only.
               Abstract class is able to allow both concrete methods and abstract methods
               Interface is able to allow abstract methods only.

            2) To declare class, only, class keyword is sufficient.
               To declare abstract class, we have to use "abstract" keyword along with class keyword.
               To declare interface we have to use "interface" keyword explicitly.

            3) For classes only, we are able to create both reference variables and objects.
               For abstract classes and interfaces, we are able to declare reference variables; we are unable to create objects.

            4) In case of interfaces, by default, all variables are "public static final".
               In case of classes and abstract classes, no default cases for variables.

            5) In case of interfaces, by default, all methods are "public and abstract".
               In case of classes and abstract classes, no default cases for methods.

            6) Constructors are allowed in classes and abstract classes.
               Constructors are not allowed in interfaces.

            7) Classes are able to provide less sharability.
               Abstract classes are able to provide moddle level sharability.
               Interfaces are able to provide more sharability.
    * */
    public static void main(String[] args){
        JavaInterface javaInterface = new InterfaceImplementationClass();
        javaInterface.printAge();
        JavaInterface.staticInterfaceMethod();

        InterfaceImplementationClass implementationClass = new InterfaceImplementationClass();
        System.out.println(" ");
        implementationClass.printAge();
        implementationClass.implementationClassMethod();
    }

}
