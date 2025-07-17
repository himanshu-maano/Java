
class Oops {
    public static void main(String[] agrs) {
        float m[] = { 5.0f, 7.8f, 8.5f };
        Student s1 = new Student(1, "sita", m);

        Student s2 = new Student(s1);
        s1.marks[0] = 90f;

        System.out.println(s2.marks[0]);
        System.out.println(s1.marks[0]);
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);

        // Account a1 = new Account();
        // a1.set_accNum(41257897);
        // a1.set_user("Himanshu");
        // a1.set_password(8458);

        // System.out.println(a1.get_user());
        // System.out.println(a1.get_accNum());
        // System.out.println(a1.get_password());

    }
}

class Student {
    public int roll;
    public String name;
    public float marks[];

    // parameterized constuctor
    Student(int roll, String naam, float marks[]) {
        // marks = new float[3];
        this.roll = roll;
        this.name = naam;
        this.marks = marks;
    }

    // shallow copy constructor
    // Student(Student s1) {
    // this.roll = s1.roll;
    // this.name = s1.name;
    // this.marks = s1.marks;
    // }


    // deep copy constructor
    Student(Student s1) {
        marks = new float[s1.marks.length];
        this.roll = s1.roll;
        this.name = s1.name;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // getter method
    public float[] getMarks() {
        return this.marks;
    }
}



class Account {
    private long acc_Num;
    private String user;
    private int password;

    public long get_accNum() {
        return acc_Num;
    }

    public void set_accNum(long acc_Num) {
        this.acc_Num = acc_Num;
    }

    public String get_user() {
        return user;
    }

    public void set_user(String user) {
        this.user = user;
    }

    public int get_password() {
        return password;
    }

    public void set_password(int password) {
        this.password = password;
    }

}

