package core.java.containers.thiskeyword;

public class ThisClassConstructor {

    int studentName;

    ThisClassConstructor(){     //No arg User defined Constructor
       this(22.22F);
    }

    ThisClassConstructor(float f){
        this(10);
        System.out.println("Inside Float constructor");
    }

    ThisClassConstructor(int i){
        System.out.println("Inside Int Constructor");
    }

    public static  void main(String[] args){
        ThisClassConstructor thisClassConstructor = new ThisClassConstructor();
    }
}
