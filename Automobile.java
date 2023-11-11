// Mohith, Keerat, Emmanuel
public class Automobile {
    private String model, license_plate;

    public Automobile(String m, String l){
        model = m;
        license_plate = l;
    }

    public String getModel(){
        return model;
    }

    public String getLicense_plate(){
        return license_plate;
    }

    public void setLicense_plate(String l){
        this.license_plate = l;
    }

    public String toString(){
        return license_plate + "(" + model + ")";
    }
}
