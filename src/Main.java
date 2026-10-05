import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room alpha = new Room(6, "Alpha");
        User ivanPetrov = new User("Ivan Petrov", "ivan.petrov@example.com");
        Room falcon = new Room(10, "Falcon");
        User mariaPopescu = new User("Maria Popescu", "maria.popescu@example.com");
        Room nebula = new Room(4, "Nebula");
        User alexSmith = new User("Alex Smith", "alex.smith@example.com");
        Room oakRoom = new Room(12, "Oak Room");
        User maximTurcan = new User("Maxim Turcan", "maxim.turcan@example.com");
        LocalDateTime start = LocalDateTime.of(2026, 10, 5, 14, 0);
        LocalDateTime end = LocalDateTime.of(2026, 10, 5, 16, 0);
        List<Booking> bookings = new ArrayList<>();
        Booking booking = new Booking(alpha, ivanPetrov, start, end);
        LocalDateTime start2 = LocalDateTime.of(2026, 10, 5, 15, 0);
        LocalDateTime end2 = LocalDateTime.of(2026, 10, 5, 17, 0);
        Booking booking2 = new Booking(alpha, mariaPopescu, start2, end2);
        bookings.add(booking);
        // A new booking is added only if it does not overlap with any existing one.
        // The flag stays true once a conflict is found, even if later bookings do not overlap.
        boolean hasConflict = false;
        for (Booking existing : bookings) {
            if (existing.overlaps(booking2)) {
                hasConflict = true;
            }
        }

        if (!hasConflict) {
            bookings.add(booking2);
        } else {
            System.out.println("Room is already booked");
        }
        System.out.println(bookings.size());
        System.out.println(booking.overlaps(booking2));
        System.out.println(booking.getRoom().getName());
        System.out.println(booking.getUser().getName());
        System.out.println(booking.getStart());


    }
}
