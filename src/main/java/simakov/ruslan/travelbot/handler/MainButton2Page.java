package simakov.ruslan.travelbot.handler;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MainButton2Page {

    private static final String MESSAGE_KIWICOM = "Сайт: www.kiwi.com\n" +
            "Язык: мульти\n" +
            "Информация: бюджетные авиарейсы. \n" +
            "Автоматически регистрируют на рейс.\n" +
            "Гарантия: если до вылета меньше 48 часов – гарантируют альтернативный рейс или возврат средств)\n" +
            "Приложение для смартфона: есть\n" +
            "Что сделать: искать по критериям «куда угодно» и «когда угодно».\n" +
            "Промокоды: KIWITRAVEL5 или KIWI5 (скидка 5€ от бронирований 50€) KIWICOM10 (скидка 10€ от бронирований 100€) KIWICOM20 (скидка 20€ от бронирований 200€)\n" +
            "Как купить билеты: lowcostavia.com.ua/kiwi-yak-kupyty-deshevi-aviakvytky";

    private static final String MESSAGE_OMIO = "Omio (ex-GOEURO)\n" +
            "Сайт: www.omio.com\n" +
            "Язык: мульти\n" +
            "Информация: поиск транспорта по европе (авиа, автобус, поезд) \n" +
            "Приложение для смартфона: есть\n" +
            "Что сделать: поиск транспорта из точки A в точку B\n" +
            "Промокоды: www.omio.ru/account/travel-bonus quants5r6x0v (скидка 10€ от бронирований 40€)";

    private static final String MESSAGE_ROME2RIO = "ROME 2 RIO \n" +
            "Сайт: www.rome2rio.com\n" +
            "Язык: английский\n" +
            "Информация: поиск транспорта по всему миру (авиа, автобус, поезд, паром, автомобиль) \n" +
            "Приложение для смартфона: есть\n" +
            "Что сделать: поиск транспорта из точки A в точку B";

    private static final String MESSAGE_INTERFLIX = "INTERFLIX от FLIXBUS\n" +
            "Сайт: https://interflix.flixbus.com\n" +
            "Язык: мульти\n" +
            "Информация: 5 билетов за 99€\n" +
            "Приложение для смартфона: есть\n" +
            "Условия:1.Через 48 часов после оплаты получите 5 купонов, которые действуют 3 месяца. \n" +
            "2. Только прямые рейсы (без пересадок), персональные, непереносимые. \n" +
            "3. Нельзя покупать обратные билеты.\n" +
            "Пример: Киев-Берлин-Амстердам-Париж-Прага-Киев";


    SendMessage getSecondLayerMessage(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText("Choose type of transport!");
        response.setReplyMarkup(getSecondLayerMenu());
        return response;
    }

    private ReplyKeyboardMarkup getSecondLayerMenu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(Button.BUTTON21.get());
        row1.add(Button.BUTTON22.get());
        KeyboardRow row2 = new KeyboardRow();
        row1.add(Button.BUTTON23.get());
        row1.add(Button.BUTTON24.get());

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);

        markup.setKeyboard(rows);
        return markup;
    }

    SendMessage getButton21Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_KIWICOM);
        return response;
    }

    SendMessage getButton22Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_OMIO);
        return response;
    }

    SendMessage getButton23Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_ROME2RIO);
        return response;
    }

    SendMessage getButton24Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_INTERFLIX);
        return response;
    }
}
