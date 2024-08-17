package core.java.containers.abstractclass;

public class SubAbstractClass extends AbstractClass{

   /*Procedure to use Abstract Classes
   * 1) Declare an abstract class with "abstract".
     2) Declare concrete methods and abstract methods in abstract class as per the requirement.
     3) Declare sub class for abstract class.
     4) Implement abstract methods in sub class.
     5) In main class and in main() method, create object for sub class and declare reference variable either for abstract class
        or for sub class.
     6) Access abstract class members.

     Note: If we declare reference variable for abstract class then we are able to access only abstract class members, but, if we
     declare reference variable for sub class then we are able to access both abstract class members and sub class members.*/

    void abstractMethod() {
        System.out.println("Abstract Class allows zero or more Abstract Methods");
    }

    void subClassMethod(){
        System.out.println("This method cannot be accessed by Abstract class reference object");
    }

}
