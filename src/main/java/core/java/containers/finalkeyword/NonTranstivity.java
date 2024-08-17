package core.java.containers.finalkeyword;

public class NonTranstivity {

    public static void main(String[] args){
        // Creating an object of StringBuilder class
        // Final reference variable
        final StringBuilder sb = new StringBuilder("Vishal");

        // changing internal state of object reference by
        //  final reference variable sb
        sb.append(" Bharat");

        //As we all know a final variable cannot be re-assign. But in the case of a reference final variable, the
        // internal state of the object pointed by that reference variable can be changed. Note that this is not re-assigning.
        System.out.println(sb);

        final int arr[] = {1,2,3};  // Final array
        arr[1]= 10;

        System.out.println(arr[1]);

    }
}
