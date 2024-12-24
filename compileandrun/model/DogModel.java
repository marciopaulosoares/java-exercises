package compileandrun.model;
public class DogModel {
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    private int legs;

    public DogModel(int legs) {
        this.legs = legs;
    }
}
