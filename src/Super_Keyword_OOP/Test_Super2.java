package Super_Keyword_OOP;

// To invoke parent class method

class  Animal_ {
    void eat (){
        System.out.println("eating.... ");
    }
}

class Dog_ extends Animal_ {

    void eat(){
        System.out.println("eating bread.... ");
    }

    void bark(){
        System.out.println("Barking.... ");
    }

    void work (){
        super.eat();
        bark();
    }
}

public class Test_Super2 {
    static void main(String[] args) {

        Dog_ obj = new Dog_();
        obj.work();

    }
}