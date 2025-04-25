import java.util.*;

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message){
        super(message);
    }
}

class UserService {

    HashSet<String> users = new HashSet<>();

    public void registerUser(String username) throws UserAlreadyExistsException {
        if(users.contains(username)) {
            throw new UserAlreadyExistsException("User is already Registered!");
        }
        users.add(username);
        System.out.println("User " + username + " has been registered!");
    }

    public void checkUserExistence(String username) throws UserNotFoundException {
        if(!users.contains(username)){
            throw new UserNotFoundException("User Not Found!");
        }
        System.out.println("User " + username + " is found!");
    }
}

public class Problem3 {
    public static void main(String[] args) {

        UserService service = new UserService();

        try {
            service.registerUser("john");
            service.registerUser("john");
        }
        catch (UserAlreadyExistsException e) {
            System.out.println("Registration Error: " + e.getMessage());
        }

        try {
            service.checkUserExistence("john");
            service.checkUserExistence("alice");
        }
        catch (UserNotFoundException e) {
            System.out.println("Lookup Error: " + e.getMessage());
        }
    }
}
