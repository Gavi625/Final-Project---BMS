public class Resource{
    private String resourceId;
    private String resourceName;
    private String resourceStatus;
    private String location;
    private int capacity;
    private boolean availability;
    private Schedule calendar;

    

    public Resource() {}

    public Resource(String resourceId, String resourceName, String resourceStatus, String location, int capacity,
            boolean availability, Schedule calendar) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceStatus = resourceStatus;
        this.location = location;
        this.capacity = capacity;
        this.availability = availability;
        this.calendar = calendar;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Schedule getCalendar() {
        return calendar;
    }

    public void setCalendar(Schedule calendar) {
        this.calendar = calendar;
    }

    public boolean validateBooking(String bookingId){
        return false;
    }

    public boolean checkAvailability(TimeSlot slot){
        return true;
    }

    public String getResourceDetails(){
        return "";
    }
}
