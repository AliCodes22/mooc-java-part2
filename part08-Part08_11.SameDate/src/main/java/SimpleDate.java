
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    @Override
    public boolean equals(Object object) {

        // check if both objects are identical
        if(this == object) {
            return true;
        }

        // check if the object being compared is an instance of this object
        if(!(object instanceof SimpleDate)) {
            return false;
        }


        // if not then convert it 
        SimpleDate comparedDate = (SimpleDate) object;


        // after converting, check if its properties are the same
        if(this.day == comparedDate.day && this.month == comparedDate.month && this.year == comparedDate.year) {
            return true;
        }

        return false;
    }

}
