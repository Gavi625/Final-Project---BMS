import java.time.LocalDateTime;
import java.time.Duration;

public class TimeSlot{
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Constructor
    public TimeSlot(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getDuration() {
        return (int)Duration.between(this.getStartTime(),this.getEndTime()).toMinutes();
    }    

    // Functionality
    public boolean overlapsWith(TimeSlot slot){
        if (slot == null) {
            return false;
        }else{
            return this.getStartTime().isBefore(slot.getEndTime()) &&
            slot.getStartTime().isBefore(this.getEndTime());}
    }

    public int getDefaultDuration(Resource resource){
        String type = resource.getResourceDetails();
        int duration = switch(type){
            case "Lab" -> 60;
            case "Court", "Equipment" -> 45;
            case "Room" -> 30;
            default -> 30;
            };
            return duration;
        }

    public boolean validtimeWindow(){
            long minutes = Duration.between(this.getStartTime(), this.getEndTime()).toMinutes();
            return this.getEndTime().isAfter(this.getStartTime()) && minutes % 15 == 0;
        }


}
