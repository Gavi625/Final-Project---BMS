import java.util.ArrayList;
import java.util.List;


public class Labs extends Venue{
    private boolean authorised;
    private String labtype;
    private final List<String> authorisedUsers = new ArrayList<>();
    


    
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

    public void addAuthorisedUser(String username){
        if(username != null && !authorisedUsers.contains(username)){
            authoriseduser.add(username);
        }
    }

    public void removeAuthorisedUser(String username){
        authorisedUsers.remove(username);
    }

    @Override
    public boolean validateBooking(String bookingId){
        return basicChecks(bookingId);
    }

    public boolean validateBooking(String bookingId, int people, String username){
        return validateBooking(bookingId, people) && checkAuthorization(username);
    }

    @Override
    public int checkCapacity(){
        return getCapacity();
    }

    public boolean checkAuthorization (String username){
        return !authorised || (username != null && authorisedUsers.contains(username));
    }
    public boolean checkAuthorization(String username){
        return !authorised || (username != null && authorisedUsers.contains(username));
    }
}
