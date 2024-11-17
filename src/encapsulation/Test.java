package encapsulation;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println(userRegistration.registerUserHighlyCoupled("abc@def.com", "pwd"));
        System.out.println(userRegistration.registerUser("abcd", "pwd"));

        // custom validation logic
        Function<String, String> emailTransformer = email -> email.toUpperCase().trim();
        Predicate<String> emailValidator = email -> email.contains(".com") && email.contains("@");
        Predicate<String> passwordValidator = pwd -> pwd.length() > 8 && pwd.length() < 12;
        System.out.println(userRegistration.higherOrderRegisterUser("abc@def.xyz", "pwd", emailTransformer, emailValidator, passwordValidator));
    }
}
