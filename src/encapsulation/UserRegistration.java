package encapsulation;

import java.util.function.Function;
import java.util.function.Predicate;

public class UserRegistration {
    private final Function<String, String> normalizeEmail = email -> email.toLowerCase().trim();
    private final Predicate<String> validateEmailFormat = email -> email.contains("@") && email.contains(".");
    private final Predicate<String> validatePassword = password -> password.length() > 8;

    public String registerUserHighlyCoupled(String email, String password) {
        // normalize email manually inside this method.
        email = email.toLowerCase().trim();
        if(!email.contains("@") || !email.contains(".")) {
            return "Invalid email!";
        }
        if(password.length() < 8) {
            return "Invalid password!";
        }
        return "User successfully registered!";
    }

    /**
     * Decoupled register user method which encapsulates validation logic.
     */
    public String registerUser(String email, String password) {
        email = normalizeEmail.apply(email);
        if(validateEmailFormat.negate().test(email)) {
            return "Invalid email format!";
        }
        if(validatePassword.negate().test(password)) {
            return "Invalid password!";
        }
        return "User registration successful!";
    }

    public String higherOrderRegisterUser(String email, String password, Function<String, String> emailTransformer, Predicate<String> emailValidator, Predicate<String> passwordValidator) {
        email = emailTransformer.apply(email);
        if(emailValidator.negate().test(email)) {
            return "Invalid email!";
        }
        if(passwordValidator.negate().test(password)) {
            return "Invalid password!";
        }
        return "User registered successfully!";
    }
}
