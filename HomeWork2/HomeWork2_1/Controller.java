package HomeWork2.HomeWork2_1;

import HomeWork2.HomeWork2_3.AuthMessage;

public interface Controller {
    void sendMessage(String msg);

    void closeConnection();

    void showUi(ClientUi clientUi);

    void sendMessage(AuthMessage authMessage);
}
