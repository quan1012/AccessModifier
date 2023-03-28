public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student(int r, String name) {
        this.rollno = r;
        this.name = name;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display (){
        System.out.println(rollno +" " + name + " " + college);
    }
}
