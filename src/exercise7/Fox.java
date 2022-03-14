package exercise7;

public class Fox implements Wild {
    private final String species;

    public Fox(String species) {
        this.name = species;
    }

    public void printSpecies() {
        System.out.println("Fox's species is " + this.species);
    }
}
