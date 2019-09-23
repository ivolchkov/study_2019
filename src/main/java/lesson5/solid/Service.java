package lesson5.solid;

public interface Service {
    //StudentService
    void registrate(User user);

    void login(String password, String login);

    //MessageService
    void sendMessage(Message message);

    //HelpService
    String getCountries();
}
