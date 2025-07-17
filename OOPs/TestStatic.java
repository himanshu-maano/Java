
public class TestStatic {
    public static void main(String[] a){
        Student.schoolName = "JIS";

        Student s1 = new Student();
        s1.setName("Hima");
        s1.roll = 38;
        // s1.schoolName = "JIS";
        // System.out.println(s1.getName());
        // System.out.println(s1.roll);
        System.out.println(Student.schoolName);

        Student s2 = new Student();
        s2.setName("Sita");
        s2.roll = 74;
        // System.out.println(s2.getName());
        // System.out.println(s2.roll);
        // System.out.println(Student.schoolName);

    }
}


class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }

     
}