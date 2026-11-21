public class Labs extends Venue{
    private boolean authorised;
    private String labtype;


    
    public Labs() {}

    public Labs(boolean authorised, String labtype) {
        this.authorised = authorised;
        this.labtype = labtype;
    }

    
    public boolean isAuthorised() {
        return authorised;
    }

    public void setAuthorised(boolean authorised) {
        this.authorised = authorised;
    }

    public String getLabtype() {
        return labtype;
    }

    public void setLabtype(String labtype) {
        this.labtype = labtype;
    }

    @Override
    public boolean validateBooking(String bookingId){
        return true;
    }

    public int checkCapacity(){
        return 0;
    }

    public boolean checkAuthorization (String username){
        return false;
    }
}