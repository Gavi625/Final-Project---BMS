public abstract class Venue extends Resource{
    protected boolean shareable;
    protected String sharingPolicy;


    public boolean isShareable() {
        return shareable;
    }
    public void setShareable(boolean shareable) {
        this.shareable = shareable;
    }
    public String getSharingPolicy() {
        return sharingPolicy;
    }
    public void setSharingPolicy(String sharingPolicy) {
        this.sharingPolicy = sharingPolicy;
    }

    public boolean canShare(){
        return shareable;
    }


    public abstract int checkCapacity();
    public abstract boolean validateBooking(String bookingId);

    public boolean checkCapacity(int people){
        return people >= 1 && people <= checkCapacity();
    }
    protected boolean basicChecks(String bookingId){
        return bookingId != null && !bookingId.trim().isEmpty() && isBookable();
    }

    public boolean validateBooking(String bookingId, int people){
        return basicChecks(bookingId) && checkCapacity(people);
    }
}
