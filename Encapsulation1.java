class Student
{
    private int age;
    private String name;

    public void show()
    {
        System.out.println(name+ " " + age);
    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();
        // obj.name="Rahul";        will not be visible bcz private
        // obj.age = 19;
        obj.show();
    }
}
