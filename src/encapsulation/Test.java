package encapsulation;

public class Test {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(userRegistration.registerUserHighlyCoupled("abc@def.com", "pwd"));
    }
}
