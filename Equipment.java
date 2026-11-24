public class Equipment extends Resource{
    private String type;
    private int qtyAvailable;
    private String condition;


    public Equipment() {}

    public Equipment(String type, int qtyAvailable, String condition) {
        this.type = type;
        this.qtyAvailable = qtyAvailable;
        this.condition = condition;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public int getQtyAvailable() {
        return qtyAvailable;
    }


    public void setQtyAvailable(int qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
    }


    public String getCondition() {
        return condition;
    }


    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean validateBooking(String bookingId){
        return true;
    }

    public String checkCondition(){
        try{
       return switch(condition.toUpperCase()){
            case "GOOD" -> "Equipment is in good working condition";
            case "FAIR" -> "Equipment may require maintenance";
            case "POOR" -> "Equipment requires maintenance";
            case "DAMAGED" -> "Equipment should not be booked";
            default -> "Invalid";
               catch(NullPointerException e){
                   return "Condition is unknown";
                }             
    }
}
    }
    
