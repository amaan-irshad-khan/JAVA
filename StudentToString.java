
import java.util.*;

class StudentToString {
    String name;
    int age;
    String rollno;
    String house;

    public StudentToString(String name, int age, String rollno, String house) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.house = house;
    }

    public String toString() {
        return "Student Details: name: " + name + ", age: " + age + ", rollno: " + rollno + ", house: " + house + " }";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Amaan", 25, "009", "new york road");
        System.out.println(stu);
    }
}

