package Overriding;

public class Agribank extends Bank{
    @Override
    int getRateOfInterest() {
        return 3;
    }
}
