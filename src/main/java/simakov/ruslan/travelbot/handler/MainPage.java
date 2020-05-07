package simakov.ruslan.travelbot.handler;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;


public class MainPage {

    public SendMessage getResponseMessage(Message message) {

        if (message.getText().equals(Button.MAIN_BUTTON1.get())) {
            return new MainButton1Page().getSecondLayerMessage(message);
        }
        if (message.getText().equals(Button.MAIN_BUTTON2.get())) {
            return new MainButton2Page().getSecondLayerMessage(message);
        }
        if (message.getText().equals(Button.MAIN_BUTTON3.get())) {
            return new MainButton3Page().getSecondLayerMessage(message);
        }
        if (message.getText().equals(Button.MAIN_BUTTON4.get())) {
            return new MainButton4Page().getSecondLayerMessage(message);
        }
        if (message.getText().equals(Button.BUTTON11.get())) {
            return new MainButton1Page().getButton11Message(message);
        }
        if (message.getText().equals(Button.BUTTON12.get())) {
            return new MainButton1Page().getButton12Message(message);
        }
        if (message.getText().equals(Button.BUTTON13.get())) {
            return new MainButton1Page().getButton13Message(message);
        }
        if (message.getText().equals(Button.BUTTON14.get())) {
            return new MainButton1Page().getButton14Message(message);
        }
        if (message.getText().equals(Button.BUTTON21.get())) {
            return new MainButton2Page().getButton21Message(message);
        }
        if (message.getText().equals(Button.BUTTON22.get())) {
            return new MainButton2Page().getButton22Message(message);
        }
        if (message.getText().equals(Button.BUTTON23.get())) {
            return new MainButton2Page().getButton23Message(message);
        }
        if (message.getText().equals(Button.BUTTON24.get())) {
            return new MainButton2Page().getButton24Message(message);
        }
        if (message.getText().equals(Button.BUTTON31.get())) {
            return new MainButton3Page().getButton31Message(message);
        }
        if (message.getText().equals(Button.BUTTON32.get())) {
            return new MainButton3Page().getButton32Message(message);
        }
        if (message.getText().equals(Button.BUTTON33.get())) {
            return new MainButton3Page().getButton33Message(message);
        }
        if (message.getText().equals(Button.BUTTON34.get())) {
            return new MainButton3Page().getButton34Message(message);
        }
        if (message.getText().equals(Button.BUTTON41.get())) {
            return new MainButton4Page().getButton41Message(message);
        }
        if (message.getText().equals(Button.BUTTON42.get())) {
            return new MainButton4Page().getButton42Message(message);
        }
        if (message.getText().equals(Button.BUTTON43.get())) {
            return new MainButton4Page().getButton43Message(message);
        }
        if (message.getText().equals(Button.BUTTON44.get())) {
            return new MainButton4Page().getButton44Message(message);
        }

        return getStartMessage(message);
    }

    SendMessage getStartMessage(Message message) {
        SendMessage response = new SendMessage();
        response.setChatId(message.getChatId());
        response.setText("Welcome, " + message.getFrom().getFirstName());
        response.setReplyMarkup(getMainMenu());
        return response;
    }

    private ReplyKeyboardMarkup getMainMenu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(Button.MAIN_BUTTON1.get());
        row1.add(Button.MAIN_BUTTON2.get());
        KeyboardRow row2 = new KeyboardRow();
        row2.add(Button.MAIN_BUTTON3.get());
        row2.add(Button.MAIN_BUTTON4.get());

        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);

        markup.setKeyboard(rows);
        return markup;
    }
}
