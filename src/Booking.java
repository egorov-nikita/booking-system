/**
 * A reservation of one room by one user for a time interval [start, end).
 * Holds references to Room and User objects instead of copies of their data.
 */
import java.time.LocalDateTime;

public class Booking {
    private Room room;
    private User user;
    private LocalDateTime start;
    private LocalDateTime end;

    public Booking(Room room, User user, LocalDateTime start, LocalDateTime end) {
        this.room = room;
        this.user = user;
        this.start = start;
        this.end = end;
    }

    public Room getRoom() {
        return room;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
    /**
     * Returns true if this booking overlaps with another one in the same room.
     * Back-to-back bookings (one ends exactly when the other starts) are allowed,
     * so we use strict isBefore instead of "before or equal".
     */
    public boolean overlaps(Booking other) {
        if (this.room != other.room) {
            return false;
        }
        return this.start.isBefore(other.end) && other.start.isBefore(this.end);
    }
}
