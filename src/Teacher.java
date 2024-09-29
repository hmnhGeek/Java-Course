public class Teacher {
    // we can also create custom constructors in a class
    private String name;
    private Integer age;
    private String degree;

    // this is an overloaded constructor which uses all three parameters.
    public Teacher(String name, Integer age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    // these are partially overloaded constructor
    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String degree) {
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
