import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Room room1 = new Room("Ganga");
        Room room2 = new Room("Yamuna");
        Room room3 = new Room("Saraswati");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Scheduler scheduler = new Scheduler(rooms);

        System.out.println(scheduler.book(1,2, 5)); //Ganga
        System.out.println(scheduler.book(1,5, 8)); //Ganga
        System.out.println(scheduler.book(1,4, 8)); //Yamuna
        System.out.println(scheduler.book(1,3, 6)); //Saraswati
        System.out.println(scheduler.book(1,7, 8)); //Saraswati
        System.out.println(scheduler.book(2,6, 9)); //Ganga
    }
}
