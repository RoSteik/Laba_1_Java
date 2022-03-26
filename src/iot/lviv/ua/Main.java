package iot.lviv.ua;

public class Main {

    public static void main(String[] args) {
        Park park1 = new Park();
        Park park2 = new Park("Львів", 15, 45);
        Park park3 = new Park("Київ", 6, 35, 23, true, false);
        System.out.println(park1 + "\n");
        System.out.println(park2 + "\n");
        System.out.println(park3 + "\n");
        System.out.println();
        System.out.println(Park.printSomeStaticField());

    }

}
