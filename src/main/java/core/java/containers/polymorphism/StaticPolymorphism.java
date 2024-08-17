package core.java.containers.polymorphism;

public class StaticPolymorphism {

    int add(int number1, int number2){
        return number1 + number2;
    }
    //void add(int number1, int number2){   Static Polymorphism cannot be archived by changing return type
      //  System.out.println(number1 + number2);
    //}

    int add(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    int add(int number1, Long long1){
        return number1 + long1.intValue();
    }

    int add(Long long1, int number1){
        return long1.intValue() + number1;
    }

    public static void main(String[] args){
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        System.out.println(staticPolymorphism.add(12L,12));
    }
}
