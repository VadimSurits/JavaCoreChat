package server;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Start {
    private static final Logger logger = Logger.getLogger("");

    public static void main(String[] args) {
        try {
            logger.addHandler(new FileHandler("chat.log", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Server();
    }
}
