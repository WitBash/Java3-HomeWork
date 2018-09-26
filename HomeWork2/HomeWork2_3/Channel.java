package HomeWork2.HomeWork2_3;


public interface Channel {

    void sendMessage(Message message);

    void sendMessage(String message);

    Message getMessage();

    boolean hasNextLine();
}
