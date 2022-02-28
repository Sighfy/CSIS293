/*
Create a class named Apartment that holds an
apartment number, number of bedrooms, number of baths, and rent amount.
Create a constructor that accepts values for each data field.
Also create a get method for each field.
 */
public class Apartment {
    int aptNumber;
    int bedrooms;
    double baths;
    double rent;

    public Apartment(int num, int bdrms, double bths, double rent) {
        aptNumber = num;
        bedrooms = bdrms;
        baths = bths;
        this.rent = rent;
    }
    public int getAptNumber() {
        return aptNumber;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public double getBaths() {
        return baths;
    }
    public double getRent() {
        return rent;
    }

}