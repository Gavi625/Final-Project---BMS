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


    public boolean validateBooking(String bookingId){
        return true;
    }

    public String checkCondition(){
        return "";
    }
}