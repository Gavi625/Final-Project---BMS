import java.time.LocalDateTime;
import java.util.TreeMap;

public class Schedule{
    private TreeMap <LocalDateTime, Booking> bookings = new TreeMap<>();

    //Getters and Setters
    public TreeMap<LocalDateTime, Booking> getBookings() {
        return bookings;
    }

    public void setBookings(TreeMap<LocalDateTime, Booking> bookings) {
        this.bookings = bookings;
    }
    //Constructors
    public Schedule() {}
    

    public Schedule(TreeMap<LocalDateTime, Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(String bookingId){
        return;
    }



    public boolean removeBooking (String bookingId){
        return true;
    }

    public String getBookingByDate(LocalDateTime date){
        return "";
    }

    public String availableSlots (LocalDateTime date){
        return "";
    }



}