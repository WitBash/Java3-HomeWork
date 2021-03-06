package HomeWork2.HomeWork2_2;

public interface AuthService {
    String authByLoginAndPassword(String login, String password);

    User createOrActivateUser(String login, String password, String nick);

    boolean deactivateUser(String nick);

}
