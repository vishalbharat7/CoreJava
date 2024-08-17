package core.java.containers.finalkeyword;

public  class FinalMethod {

    final void display(){
        final int localFinalVariable;
        localFinalVariable = 11;
        System.out.println("Ïnside Final Method");
        System.out.println(localFinalVariable);
    }

    public static void main(String[] args){
        final int localFinalVariable;
        //localFinalVariable =10;   Its not necessary to initialize local fina lVariable, if its not used, if u r using it then init it
        FinalMethod finalMethod = new FinalMethod();
        finalMethod.display();;
        //System.out.println(localFinalVariable);
    }
}

class finalMethodSubClass extends FinalMethod{
    // void display(){}
    // 'display()' cannot override 'display()' in 'core.java.containers.finalkeyword.FinalMethod'; overridden method is final

}
