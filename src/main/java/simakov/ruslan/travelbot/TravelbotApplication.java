package simakov.ruslan.travelbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import simakov.ruslan.travelbot.handler.TelegramBot;

@SpringBootApplication
public class TravelbotApplication {

    public static void main(String[] args) throws TelegramApiRequestException {
        SpringApplication.run(TravelbotApplication.class, args);
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        telegramBotsApi.registerBot(new TelegramBot());
    }
}
