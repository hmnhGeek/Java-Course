package encapsulation;

public class UserRegistration {
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
}
