package Inheritance_OOP;

class parent_class {
    void display(){
        System.out.println(" Parent class method ");
    }
}

// Java_OOp inheritance

class child_class extends parent_class{
    void show (){
        System.out.println(" Child class Method ");
    }
}

public class Inheritance_Demo {
    static void main(String[] args) {
        child_class obj = new child_class();

        obj.display();
        obj.show();
    }
}