package core.java.containers.javainterface;

public interface JavaInterface {

    int age = 24;
    void printAge();

    static void staticInterfaceMethod(){
        System.out.println("In JAVA 8 version, static and default methods were introduced to Interface");
        privateStaticInterfaceMethod();
    }

    private void privateInterfaceMethod(){
        System.out.println("In JAVA 9 version, private methods were introduced to Interface");
    }
    private static void privateStaticInterfaceMethod(){
        System.out.println("In JAVA 9 version, private methods were introduced to Interface");
    }

    /*################################# Interface #############################################
    *  1.Interface is a java feature, it able to allow zero or more no of abstract methods only.
       2. For interfaces, we are able to declare only reference variables; we are unable to create objects.
       3.In case of interfaces, by default, all the variables as "public static final".
       4.In case of interfaces, by default, all the methods are "public and abstract".
       5.When compared with classes and abstract classes, interfaces will provide more sharability. */

    public static void main(String[] args){
        JavaInterface javaInterface = new InterfaceImplementationClass();
        //JavaInterface javaInterface1 = new JavaInterface(); <---
        JavaInterface.staticInterfaceMethod();
        JavaInterface.privateStaticInterfaceMethod();
    }
}
