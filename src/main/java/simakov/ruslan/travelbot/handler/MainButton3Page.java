package simakov.ruslan.travelbot.handler;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MainButton3Page {

    private static final String MESSAGE_FLY4FREE = "Сайт: www.fly4free.com\n" +
            "Язык: английский\n" +
            "Информация: готовые варианты перелётов (переездов) и/или проживания\n" +
            "Приложение для смартфона: есть\n" +
            "Что сделать: настроить рассылку уведомлений, например #kyiv #kiev #ukraine";

    private static final String MESSAGE_VANDROUKI = "Сайт: www.vandrouki.by\n" +
            "Язык: русский\n" +
            "Информация: готовые варианты перелётов (переездов) и/или проживания\n" +
            "Приложение для смартфона: нет (есть телеграм канал)\n" +
            "Что сделать: подписаться на рассылку уведомлений";

    private static final String MESSAGE_LOWCOSTAVIA = "Сайт: www.lowcostavia.com.ua\n" +
            "Язык: украинский\n" +
            "Информация: готовые варианты перелётов (переездов) и/или проживания со скидками \n" +
            "+ туры на misto.travel\n" +
            "Приложение для смартфона: нет (есть телеграм канал)\n" +
            "Что сделать: подписаться на рассылку уведомлений";

    private static final String MESSAGE_HOTELSCOMBINED = "Сайт: www.hotelscombined.com\n" +
            "Язык: мульти\n" +
            "Информация: агрегатор гостинниц по всему миру (перенаправляет на официальные сайты: booking.com, agoda.com, hotels.com)\n" +
            "Приложение для смартфона: roomguru\n" +
            "Что сделать: подписаться на выбранное направление, перед бронью гостиниц на другом сайте проверить здесь";


    SendMessage getSecondLayerMessage(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText("Choose: ");
        response.setReplyMarkup(getSecondLayerMenu());
        return response;
    }

    private ReplyKeyboardMarkup getSecondLayerMenu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(Button.BUTTON31.get());
        row1.add(Button.BUTTON32.get());
        KeyboardRow row2 = new KeyboardRow();
        row1.add(Button.BUTTON33.get());
        row1.add(Button.BUTTON34.get());

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);

        markup.setKeyboard(rows);
        return markup;
    }

    SendMessage getButton31Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_FLY4FREE);
        return response;
    }

    SendMessage getButton32Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_VANDROUKI);
        return response;
    }

    SendMessage getButton33Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_LOWCOSTAVIA);
        return response;
    }

    SendMessage getButton34Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_HOTELSCOMBINED);
        return response;
    }
    }
