package simakov.ruslan.travelbot.handler;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MainButton4Page {
    private static final String MESSAGE_VISA_RULES = "Сайт: mfa.gov.ua/ua/consular-affairs/travel-advice/entering-foreign-countries \n" +
            "mfa.gov.ua : Консульські питання → Поради подорожуючим → Режим в'їзду до іноземних країн громадянам України\n" +
            "+ СИСТЕМА ДРУГ (Добровольная Регистрация Граждан Украины при путешествиях заграницу) friend.mfa.gov.ua/#/countries\n" +
            "Язык: украинский\n" +
            "Информация: визовые, медецинские, таможенные требования\n" +
            "Приложение для смартфона: нет\n" +
            "Что сделать: проверить ограничения";

    private static final String MESSAGE_VISA_RULES2 = "International Air Transport Association (IATA)\n" +
            "Сайт: www.iatatravelcentre.com\n" +
            "+ Timatic\n" +
            "\tКЛМ: https://klm.traveldoc.aero \n" +
            "\tЭМИРЕЙТС: http://emirates.com/english/before-you-fly/visa-passport-information/find-visa-requirements.aspx\n" +
            "Язык: английский\n" +
            "Информация: визовые и медицинские требования\n" +
            "Приложение для смартфона: нет\n" +
            "Что сделать: проверить ограничения";

    private static final String MESSAGE_SCHENGEN = "Страны: Австрия, Бельгия, Греция, Дания, Эстония, Исландия, Испания, Италия, Латвия, Литва, Лихтенштейн, Люксембург, Мальта, Нидерланды, Норвегия, Польша, Португалия, Словакия, Словения, Венгрия, Финляндия, Франция, Чехия, Швейцария, Швеция, Болгария, Республика Кипр, Румыния и Хорватия. \n" +
            "Нужна виза: Британия и Ирландия\n" +
            "Больше: http://lowcostavia.com.ua/yaki-dokumenty-potribni-dlya-bezvizovogo-peretynu-kordonu/\n" +
            "http://lowcostavia.com.ua/pravyla-bezvizu-detalno-vidpovidi/";

    private static final String MESSAGE_DESEASE = "Центр предотвращения и контроля заболеваний в США\n" +
            "Сайт: wwwnc.cdc.gov/travel/destinations/list \n" +
            "Язык: английский\n" +
            "Информация: рекомендации по прививкам\n" +
            "Что сделать: проверить рекомендации по вакцинации,\n" +
            "оценить риски, провести вакцинацию \n" +
            "Распространённые: при поликлиниках – гепатит B, туберкулёз, корь, паротит, краснуха, коклюш, дифтерия, столбняк\n" +
            "Специфические: Александровская больниц" +
            "а, 4-й корпус, кабинет 110, ул.Шелковичная, 39/1, г.киев, в будни с 9-00 до 14-00 – брюшной тиф, жёлтая лихорадка, гепатиты A и B, клещевой энцефалит";


    SendMessage getSecondLayerMessage(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText("Choose type of information!");
        response.setReplyMarkup(getSecondLayerMenu());
        return response;
    }

    private ReplyKeyboardMarkup getSecondLayerMenu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(Button.BUTTON41.get());
        row1.add(Button.BUTTON42.get());
        KeyboardRow row2 = new KeyboardRow();
        row1.add(Button.BUTTON43.get());
        row1.add(Button.BUTTON44.get());

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);

        markup.setKeyboard(rows);
        return markup;
    }

    SendMessage getButton41Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_VISA_RULES);
        return response;
    }

    SendMessage getButton42Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_VISA_RULES2);
        return response;
    }

    SendMessage getButton43Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_SCHENGEN);
        return response;
    }

    SendMessage getButton44Message(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText(MESSAGE_DESEASE);
        return response;
    }
}
