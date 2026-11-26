import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class User{
    private String userId;
    private String username;
    private String email;
    private String role;
    private int accountabilityPoints;

    private List<Booking> bookings;

    
    public User() {
        this.bookings = new ArrayList<>();
    }

    public User(String userId, String username, String email, String role, int accountabilityPoints) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.role = role;
        this.accountabilityPoints = accountabilityPoints;
        this.bookings = new ArrayList<>();
    }

    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAccountabilityPoints() {
        return accountabilityPoints;
    }

    public void setAccountabilityPoints(int accountabilityPoints) {
        if (acccountabilityPoints >= 0) {
            this.accountabilityPoints = accountabilityPoints;
        }
    }

    public List<Booking> getBookings() {
        return Collections.unmodifiableList(bookings);
    }

    // For retrieving the user's booking history.
    public List<Booking> getBookingHistory(){
        return Collections.unmodifiableList(bookings);
    }
    
    //To add a booking to a user's history.
    public void addBooking(Booking booking){
        if (booking == null) {
            throw new IllegalArgumentException("Booking has to be filled.");
        }

        if (!booking.contains(booking)) {
            bookings.add(booking);
        }
    }

    //To find and view booking using the ID.
    public Booking viewBooking(String bookingId){
        if (bookingId == null || boookingId.trim().isEmpty()) {
            return null;
        }

        for (Booking booking : bookings) {
            if (booking.getbookingId.equals(bookingId)) {
                return booking;
            }
        }
        return null;
    }
    
    //For removing a booking a user's booking list.
    public boolean removeBooking(Booking booking) {
        if(booking == null) {
            return false;
        }
        return bookings.remove(booking);
    }

    //😭😭 I am not sure we need this, since we already have an add-booking method on line 81.
    public String requestBooking(String resourceId, TimeSlot slot){
        return "";
    }

    //For cancelling existing bookings using the ID.
    public boolean cancelBooking(String bookingId){
        Booking booking = viewBooking (bookingId);

        if (booking = null){
        return false;
        }

        booking.cancel();
        return true;
    }
}
