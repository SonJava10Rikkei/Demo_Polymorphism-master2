package Overriding;

import upcasting.Cat;

public class TestOverriding {
    public static void main(String[] args) {

        Bank bidv = new Bidv();
        Bank tech = new Tech();
        Bank agri = new Agribank();
        Bank bank = new Bank();
        System.out.println("BIDV Rate of Interest: "+bidv.getRateOfInterest());
        System.out.println("TECH Rate of Interest: "+tech.getRateOfInterest());
        System.out.println("AGRIBANK Rate of Interest: "+agri.getRateOfInterest());
        System.out.println("BANK Rate of Interest: "+bank.getRateOfInterest());

    }
}
