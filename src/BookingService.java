import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();
    public boolean addBooking(Booking newBooking){
        for (Booking existing : bookings){
            if (existing.overlaps(newBooking)){
                return false;
            }
        }
        bookings.add(newBooking);
        return true;
    }
    public int getCount() {
        return bookings.size();
    }
}
