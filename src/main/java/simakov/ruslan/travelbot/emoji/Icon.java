package simakov.ruslan.travelbot.emoji;

import com.vdurmont.emoji.EmojiParser;

public enum Icon {
    PLUS(":heavy_plus_sign:"),
    MINUS(":heavy_minus_sign:"),
    CHECK(":white_check_mark:"),
    NOT(":x:"),
    NOMOBILEPHONES(":no_mobile_phones:"),
    DONOTLITTER(":do_not_litter:"),
    NONPORTABLEWATER(":non-potable_water:"),
    AIRPORT(":baggage_claim:"),
    BUTTERFLY(":butterfly:"),
    FLAG(":checkered_flag:"),
    POUCH(":pouch:"),
    PURSE(":purse:"),
    YELLOWHEART(":yellow_heart:"),
    BLUEHEART(":blue_heart:"),
    PURPLEHEART(":purple_heart:"),
    GREENHEART(":green_heart:"),
    EYEGLASSES(":eyeglasses:"),
    RIBBON(":ribbon:"),
    KISS(":kiss:"),
    RING(":ring:"),
    GEM(":gem:"),
    FOOTPRINTS(":footprints:"),
    WOLF(":wolf:"),
    CAT(":cat:"),
    MOUSE(":mouse:"),
    HOUSE(":abandoned_house:");

    private String value;

    public String get() {
        return EmojiParser.parseToUnicode(value);
    }

    Icon(String value) {
        this.value = value;
    }
}
