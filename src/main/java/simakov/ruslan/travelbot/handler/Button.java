package simakov.ruslan.travelbot.handler;

import simakov.ruslan.travelbot.emoji.Icon;

public enum Button {

    MAIN_BUTTON1(Icon.HOUSE.get() + " Accommodation"),
    MAIN_BUTTON2(Icon.BUTTERFLY.get() + " Transport"),
    MAIN_BUTTON3(Icon.NOMOBILEPHONES.get() + " Aggregators"),
    MAIN_BUTTON4(Icon.AIRPORT.get() + " Travel Information"),

    BUTTON11(Icon.CHECK.get() + " BOOKING.COM"),
    BUTTON12(Icon.PLUS.get() + " AIRBNB"),
    BUTTON13(Icon.DONOTLITTER.get() + " A&O HOSTEL"),
    BUTTON14(Icon.NONPORTABLEWATER.get() + " COUCHSERFING"),

    BUTTON21(Icon.POUCH.get() + " KIWI.COM"),
    BUTTON22(Icon.PURSE.get() + " OMIO"),
    BUTTON23(Icon.EYEGLASSES.get() + " ROME2RIO"),
    BUTTON24(Icon.RIBBON.get() + " FLIXBUS"),

    BUTTON31(Icon.KISS.get() + " FLY4FREE"),
    BUTTON32(Icon.RING.get() + " VANDROUKI.BY"),
    BUTTON33(Icon.GEM.get() + " LOWCOSTAVIA"),
    BUTTON34(Icon.FOOTPRINTS.get() + " HOTELSCOMBINED"),

    BUTTON41(Icon.FLAG.get() + " VISA RULES - UKRAINE"),
    BUTTON42(Icon.WOLF.get() + " VISA RULES - IATA"),
    BUTTON43(Icon.CAT.get() + " Schengen"),
    BUTTON44(Icon.MOUSE.get() + " Vaccination");

    private String value;

    public String get() {
        return value;
    }

    Button(String value) {
        this.value = value;
    }
}
