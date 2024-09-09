// object class
public class CD {
    String artist;
    int numsong;
    String label;

    public CD() {
        super();
        artist = "";
        numsong = 0;
        label = "";  

    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumsong() {
        return this.numsong;
    }

    public void setNumsong(int numsong) {
        this.numsong = numsong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    
}