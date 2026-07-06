package OOP_Method_Demo;

class FirstCode {

    String name ;
    int rollno ;

}
public class Demo {
    public static void main(String[] args) {

        FirstCode obj = new FirstCode();

        obj.name = "Ram";
        obj.rollno = 15;

        System.out.println(obj.name);
        System.out.println(obj.rollno);
    }
}