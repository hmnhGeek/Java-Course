public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Albert Einstien");
        student.setAge(90);
        student.setAddress("Germany");
        student.setRollNumber(1);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
        System.out.println(student.getRollNumber());
        System.out.println();

        Teacher teacher = new Teacher("ABC");
        teacher.setAge(100);
        teacher.setDegree("None");

        Teacher teacher1 = new Teacher("DEF", "Some Degree");
        teacher1.setAge(101);

        Teacher teacher2 = new Teacher("GHI", 10, "Another Degree");
    }
}