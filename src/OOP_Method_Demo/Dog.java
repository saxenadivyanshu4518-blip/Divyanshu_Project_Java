package OOP_Method_Demo;

public class Dog {

    int License_id;
    String name;

    // Java method

    public void eat() {

        System.out.println(name + "eats");

    }
        static void main() {

            Dog mydog = new Dog();
            mydog.name = "Bruno ";
            mydog.eat();

    }
}
