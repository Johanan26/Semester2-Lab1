package ie.atu.productv3;

public class Tv extends Product{

    private String screensize;
    private String Manufacture;

    public Tv(){
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