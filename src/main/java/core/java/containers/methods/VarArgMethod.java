package core.java.containers.methods;

public class VarArgMethod {

     static void add(int ... a){
        System.out.println("Type of a -> " + a.getClass());
        System.out.println("Number of arguments Passed to function->" + a.length);
        int result = 10;
        for(int i=0; i< a.length; i++){
            System.out.println(i+1 + "th argument is " + a[i]);
            result += a[i];
        }
        System.out.println(result);
    }

    static void multiVarArgMethod(float marks, int ... a){
         System.out.println(marks);
         System.out.println(a.length);
    }

    public static void main(String[] args){
         add(10,20,30,40);
         //VarArgMethod.add(10,20,30);

    }
}
