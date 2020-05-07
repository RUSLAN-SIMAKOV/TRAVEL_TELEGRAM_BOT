package simakov.ruslan.travelbot.handler;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MainButton1Page {

    private static final String MESSAGE_BOOKINGCOM = "Сайт: www.booking.com/s/15_8/c9840753 \n" +
            "Акция: при бронировании по ссылке от 30 € получите возврат в размере 10% на банковскую карту после поездки.\n" +
            "Язык: мульти\n" +
            "Информация: бронирование гостинниц по всему миру\n" +
            "Приложение для смартфона: есть\n" +
            "Что сделать: подписаться на выбранное направление, перед бронью гостиниц проверить на Hotelscombined";

    private static final String MESSAGE_AIRBNB = "Сайт: abnb.me/e/n0b6oilJzP\n" +
            "Язык: мульти\n" +
            "Информация: бронирование квартир и комнат по всему миру \n" +
            "Приложение для смартфона: есть\n" +
            "Акция: При первом бронировании по ссылке от 83 $ получите мгновенную скидку в размере 15%.\n" +
            "Что сделать: подписаться на выбранное направление, перед бронью гостиниц проверить на Hotelscombined";

    private static final String MESSAGE_AOHOSTEL = "29€ две ночи для двоих с завтраком в 6 местном хостеле\n" +
            "Города: Ахен, Амстердам, Берлин, Бремен, Будапешт, Кёльн, Копенгаген, Дортмунд, Дрезден, Дюсельдорф," +
            "Франкфурт, Грац, Гамбург, Лейпциг, Мюнхен, Нюрнберг, Прага, Зальцбург, Штутгарт, Венеция, Вена, Варшава, Веймар.\n" +
            "Сайт: http://voucher.aohostels.com/availability_check.php\n" +
            "Проверяем наличие мест (нужные даты, города). Комнаты нужно выбрать ОБЩИЕ. Если места есть\n" +
            "тут https://www.voucherwonderland.com/ao-hostels-mehrbettzimmer?fbclid=IwAR3b9JtOQRWuD405TM-DOEhDS7oMshxamN1cOmyr8XPud4_-Fg7fDrH_P8M&h=AT1YC5rFSoOkkEVKlQiRc_1ldVCmP5bRyyJ покупаешь ваучер, промокод-скидка на 3€\n" +
            "384Y333\n" +
            "На почту приходит код, который используется для бронирования (действителен 3 года)";
    private static final String MESSAGE_COUCHSERFING = "Сайт: www.couchsurfing.com\n" +
            "Язык: мульти\n" +
            "Информация: ресурс по культурному обмену\n" +
            "Миссия: Мы предвидим, что мир станет лучше благодаря путешествиям, а путешествия станут еще лучше благодаря связям. Каучсёрферы делятся своей жизнью с людьми, с которыми они сталкиваются, способствуя культурному обмену и взаимному уважению.\n" +
            "Приложение для смартфона: есть\n" +
            "Что сделать: подробно описать себя и свои увлечения, добавить фотографии. В неделю можно написать 10 людям. Чтобы снять ограничение на 3 месяца – принять каучсёрфера или 25 долларов. ";


    SendMessage getSecondLayerMessage(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText("Choose type of accommodation!");
        response.setReplyMarkup(getSecondLayerMenu());
        return response;
    }

    private ReplyKeyboardMarkup getSecondLayerMenu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(Button.BUTTON11.get());
        row1.add(Button.BUTTON12.get());
        KeyboardRow row2 = new KeyboardRow();
        row1.add(Button.BUTTON13.get());
        row1.add(Button.BUTTON14.get());

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);

        markup.setKeyboard(rows);
        return markup;
    }

    SendMessage getButton11Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_BOOKINGCOM);
        return response;
    }

    SendMessage getButton12Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_AIRBNB);
        return response;
    }

    SendMessage getButton13Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_AOHOSTEL);
        return response;
    }

    SendMessage getButton14Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_COUCHSERFING);
        return response;
    }

}
