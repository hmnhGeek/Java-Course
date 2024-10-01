package animals;

public class Animal {
    private String name;
    private Integer age;

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

    public void eat() {
        System.out.println("This animal is eating food.");
    }

    public void sayHello() {
        System.out.println("This animal is speaking.");
    }
}
