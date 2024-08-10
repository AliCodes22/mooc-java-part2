
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;
    private  String owner;

    public LicensePlate(String country, String liNumber, String owner) {
        this.liNumber = liNumber;
        this.country = country;
        this.owner = owner;
    
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }



    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
        if(object == this) {
            return true;
        }

        if(!(object instanceof LicensePlate)){
            return false;
        }

        LicensePlate convertedLicensePlate = (LicensePlate) object;

        if(this.liNumber.equals(convertedLicensePlate.liNumber) && this.country.equals(convertedLicensePlate.country)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = this.liNumber.hashCode() * 31;
        code = this.country.hashCode() + 31;

        return code;
    }

}
