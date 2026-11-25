public class Room extends Venue{
    private String roomType;
    private boolean hasWhiteBoard;
    private boolean hasProjector;

    

    public Room() {}

    public Room(String roomType, boolean hasWhiteBoard, boolean hasProjector) {
        this.roomType = roomType;
        this.hasWhiteBoard = hasWhiteBoard;
        this.hasProjector = hasProjector;
    }



    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isHasWhiteBoard() {
        return hasWhiteBoard;
    }

    public void setHasWhiteBoard(boolean hasWhiteBoard) {
        this.hasWhiteBoard = hasWhiteBoard;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }
    

    @Override
    public boolean validateBooking(String bookingId){
        return basicChecks(bookingId) && checkCapacity() > 0;
    }

    @Override
    public int checkCapacity(){
        return getCapacity();
    }
    public boolean roomBooking(String bookingId){
        return validateBooking(bookingId):
    }

    public boolean checkOccupancy(int people) {
        return checkCapacity(people);
    }
    
    
}
