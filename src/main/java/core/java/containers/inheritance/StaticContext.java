package core.java.containers.inheritance;

public class StaticContext {

    static void  staticContextMethod(){
        System.out.println("Starting static context`");
    }

    static{
        System.out.println("Starting static Block`");
    }
}


class SubStaticConextClass extends  StaticContext{
    static void SubStaticConextMethod(){
        System.out.println("Inside SubStaticConetxClass Method");
    }

    static{
        System.out.println("Inside SubStaticConetxClass Block");
    }
}

class SubSubStaticContextClass extends SubStaticConextClass{
    static void SubSubStaticConextMethod(){
        System.out.println("Indside SubSubStaticContext Method");
    }

    static{
        System.out.println("Indside SubSubStaticContext Block");
    }
}

class Test{
    public static void main(String[] args){
        SubSubStaticContextClass subSubStaticContextClass = new SubSubStaticContextClass();
    }
}
