abstract class Venue{
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


    public abstract int checkCapacity();
    public abstract boolean validateBooking(String bookingId);
}