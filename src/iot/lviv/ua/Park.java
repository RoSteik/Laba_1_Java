package iot.lviv.ua;

public record Park(String address, int lengthOfBicycleRoad, double ticketPrice, int benchesInPark, boolean isSnoopDogAllowed, boolean isSmokingAllowed) {
    private static int someStaticField = 23;

    public Park(){
        this("Стрий", 5, 23.67);
    }
    public Park(String address, int lengthOfBicycleRoad, double ticketPrice){
        this(address, lengthOfBicycleRoad, ticketPrice, 12, true, true);
    }
    @Override
    public String toString(){
        return  "Адреса парку - " + address +
                "\nДовжина велосипедних доріжок у парку - " + lengthOfBicycleRoad +
                "\nЦіна квитка - " + ticketPrice +
                "\nКількість лавочок у парку - " + benchesInPark +
                "\nЧи дозволено приводити собак - " + isSnoopDogAllowed +
                "\nЧи дозволено курити - " + isSmokingAllowed;
    }
    public static String printSomeStaticField(){
        return "Просте виведення статичного поля (someStaticField) - " + someStaticField;
    }


}
