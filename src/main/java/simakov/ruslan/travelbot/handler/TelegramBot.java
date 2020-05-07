package simakov.ruslan.travelbot.handler;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot {

    private static final String USERNAME = "";
    private static final String TOKEN = "";
    private MainPage mainPage;


    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        mainPage = new MainPage();
        Message message = update.getMessage();
        execute(mainPage.getResponseMessage(message));
    }

    @Override
    public String getBotUsername() {
        return USERNAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }


}
