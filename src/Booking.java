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

    public boolean overlaps(Booking other) {
        if (this.room != other.room) {
            return false;
        }
        return this.start.isBefore(other.end) && other.start.isBefore(this.end);
    }
}
