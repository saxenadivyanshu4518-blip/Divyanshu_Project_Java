package Constructor_OOP;

class  Students {

    int id ;
    int age ;

    // Java Constructor
    Students ( int id , int age){

        this.id = id;
        this.age = age;

        System.out.println("Hello Dosto");
    }
}

public class Constructor_Demo {
    static void main(String[] args) {

        Students obj = new Students(5,18);
    }
}