public class Booking{
    private String bookingId;
    private String resource;
    private String user;
    private TimeSlot timeSlot;
    private boolean bookingStatus;

    public Booking(){}
        
    public Booking(String bookingId, String resource, String user, TimeSlot timeSlot, boolean bookingStatus) {
        this.bookingId = bookingId;
        this.resource = resource;
        this.user = user;
        this.timeSlot = timeSlot;
        this.bookingStatus = bookingStatus;
    }


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String confirmBooking(){
        return "";
    }

    public String cancelBooking(){
        return "";
    }

    public void editBooking(TimeSlot slot){
        return;
    }

    public String getBookingDetails(){
        return "";
    }

    public static void main (String[] args){

    }
}   
