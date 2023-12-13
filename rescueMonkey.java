public class Monkey extends RescueAnimal {

    private String species;
    private String height;
    private String taillength;
    private String bodylength;


    //Mutators for inherited methods from RescueAnimal
    public Monkey(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tail, String body, String height2) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }
    //Accessor Methods
    public void setHeight(String height) {
        this.height = height;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setTailLength(String taillength) {
        this.taillength = taillength;
    }

    public void setBodyLength(String bodylength) {
        this.bodylength = bodylength;
    }

    
    //Mutator Methods
    public String getHeight() {
        return height;
    }

    public String getSpecies() {
        return species;
    }

    public String getTailLength() {
        return taillength;
    }

    public String getBodyLength() {
        return bodylength;
    }

    
}

