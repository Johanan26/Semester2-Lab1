package ie.atu.productv4;

public class Music extends Product {

    private String artist;
    private String label;

    public Music() {
        super();
        artist = "";
        count++;
        label = "";
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist + "from " + label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel(){return label;}
}