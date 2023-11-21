package xEXERCISE_FINAL.Polymorphism.PlantHerbFlower;

public class Herb extends Plant {
    private boolean isMedecinal;
    private String season;

    Herb() {
    }
    Herb(boolean isMedecinal, String season) {
        this.isMedecinal = isMedecinal;
        this.season = season;
    }
    Herb(String name, String color, boolean isMedecinal, String season) {
        super(name, color);
        this.isMedecinal = isMedecinal;
        this.season = season;
    }
    public boolean isMedecinal() {
        return isMedecinal;
    }
    public void setMedecinal(boolean isMedecinal) {
        this.isMedecinal = isMedecinal;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    @Override
    public String toString() {
        return "Herb [isMedecinal=" + isMedecinal + ", season=" + season + "]";
    }
    
    
    
}
