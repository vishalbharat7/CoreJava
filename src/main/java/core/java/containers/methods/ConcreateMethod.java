package core.java.containers.methods;

public class ConcreateMethod {

     static void add(int i, int j)   // Header/Declarative Part
     {System.out.println(i+j);}      //Body/Implementation part

 /*
 *  ################## JAVA Methods###################
 *   In JAVA there are two types of Methods
 *     1.Concrete Method(Complete)
 *     2.Abstract Methods(ImComplete)
 *
 *   Method Declaration-> void add(int i, int j)
 *   Method Implementation -> { //Method body}
 * */


    public static void main(String[] args){
        add(20, 10);
        ConcreateMethod.add(30,40);
    }
}
