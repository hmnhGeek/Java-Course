public class Student {
    // In encapsulation, class properties are defined as private.
    private String name;
    private Integer rollNumber;
    private Integer age;
    private String address;

    // you must also create getters and setters for these properties so that they
    // can be used elsewhere.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        if(rollNumber <= 0) {
            System.out.println("Invalid roll number!");
            return;
        }
        this.rollNumber = rollNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age < 0 || age > 125) {
            System.out.println("Invalid age!");
            return;
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
