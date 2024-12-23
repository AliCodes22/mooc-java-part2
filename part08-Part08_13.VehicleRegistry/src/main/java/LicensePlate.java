
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public String getLiNumber() {
        return this.liNumber;
    }
    
    


    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
      if(this == object) {
        return true;
      }

    if(!(object instanceof LicensePlate)) {
        return false;
    }

    LicensePlate comparedLicensePlate = (LicensePlate) object;

    return this.liNumber == comparedLicensePlate.liNumber && this.country.equals(comparedLicensePlate.country);

    }

    @Override
    public int hashCode() {
        int code = 17;
        code = this.liNumber.hashCode() * 31;
        code = this.country.hashCode() + 31;

        return code;
    }

}
