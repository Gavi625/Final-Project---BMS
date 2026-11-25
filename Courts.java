public class Courts extends Venue{
    private String courtType;
    private String sport;
    private int maxPlayers;
    private double duration;

    

    public Courts() {
        this.shareable = true;
    }

    public Courts(String courtType, String sport, int maxPlayers, double duration) {
        this.courtType = courtType;
        this.sport = sport;
        this.maxPlayers = maxPlayers;
        this.duration = duration;
        this.shareable = true;
        this.sharingPolicy = "other players may join until" + maxPlayers + "players";
    }


    public String getCourtType() {
        return courtType;
    }

    public void setCourtType(String courtType) {
        this.courtType = courtType;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

   @Override
    public boolean validateBooking(String bookingId){
        return basicChecks(bookingId) && maxPlayers > 0;
    }

    @Override
    public int checkCapacity(){
        return maxPlayers;
    }
}
