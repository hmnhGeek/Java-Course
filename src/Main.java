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
    }
}