package core.java.containers.polymorphism;

class SuperClass{

    int data;

    public void setData(int data) {
        this.data = data;
    }

    void display(){
        System.out.println("Ïnside Super class");
    }

}

class SubClass extends SuperClass{

    @Override
    void display(){
        System.out.println("Inside Sub class");
    }
}
public class DynamicPolymorphism {

    public static void main(String[] args){
        SuperClass superClass = new SubClass();
        superClass.setData(12);
        superClass.display();
    }
}
