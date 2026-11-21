public class User{
    private String userId;
    private String username;
    private String email;
    private String role;
    private int accountabilityPoints;

    
    public User() {}

    public User(String userId, String username, String email, String role, int accountabilityPoints) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.role = role;
        this.accountabilityPoints = accountabilityPoints;
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
        this.accountabilityPoints = accountabilityPoints;
    }

    

    public String requestBooking(String resourceId, TimeSlot slot){
        return "";
    }

    public String viewBooking(String bookingid){
        return "";
    }

    public String cancelBooking(String bookingId){
        return "";
    }

    public String getBookingHistory(String resourceId){
        return "";
    }
}