package core.java.containers.statickeyword;

public class StaticContext {

    int studentId;

    static String collegeName;

    static void setCollegeName(){
        // this.studentId = 123; cannot be referenced from a static context
        collegeName = "XYZ";
    }

    static int i = staticmethod1();

    static int staticmethod1(){
        System.out.println("Inside static Method 1");
        return 0;
    }

    static {
        System.out.println("Inside static Block");
    }

    static int staticmethod2(){
        System.out.println("Inside static Method 2");
        return 0;
    }

    static int j = staticmethod2();

    public static void main(String[] args){
        System.out.println(StaticContext.collegeName);
        setCollegeName();
        System.out.println(collegeName);
    }

}
