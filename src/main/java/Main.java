public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
//      이렇게 하면 문제가 발생합니다. Hint: 각 service 마다 Hotel을 생성하고있네요?
        HotelConsole hotelConsole = new HotelConsole(new HotelService(hotel), new GuestService(hotel));
        hotelConsole.startConsole();
    }
}

