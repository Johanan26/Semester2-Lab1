package ie.atu.productv4;

public class TV extends Product{

    private String screensize;
    private String Manufacture;

    public TV(){
        super();
        screensize = " ";
        Manufacture = " ";
        count++;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    public String getScreensize() {
        return screensize;
    }

    public String getManufacture() {
        return Manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + "  by  "+ Manufacture;

    }
}