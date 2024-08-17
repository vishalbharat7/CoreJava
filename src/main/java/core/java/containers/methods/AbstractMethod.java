package core.java.containers.methods;

public abstract class AbstractMethod {

    abstract void abstractMethod(int i, int j);

/* ########################INTERVIEW QUESTION #######################################
*  Q. What are the differences between Concrete methods and abstract methods?
*  Ans. 1.Concrete method is a method, it will have both method declaration and method implementation.
          Abstract method is a method, it will have only method declaration.
          EX: abstract void add(int i, int j);
       2.To declare concrete methods, no need to use any special keyword.
         To declare abstract method, we must use abstract keyword.
       3.Concrete methods are allowed in classes and in abstract classes.
         Abstract methods are allowed in abstract classes and interfaces.
       4.Concrete methods will provide less sharability.
         Abstract methods will provide more sharability
* */

}
