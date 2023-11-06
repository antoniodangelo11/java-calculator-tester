package org.lessons.tester;

public class Ticket {

    //ATTRIBUTI

    private double travelKm;
    private double agePerson;
    private final double priceForKm = 0.21;
    private double discountUnder18 = 0.20;
    private double discountOver65 = 0.40;


    // COSTRUTTORI
    public Ticket( double travelKm, double priceForKm, double agePerson) {
        this.travelKm = travelKm;
        this.agePerson = agePerson;
    }


    // GETTER E SETTER
    public double getTravelKm() {
        return travelKm;
    }

    public double getPriceForKm() {
        return priceForKm;
    }

    public double getAgePerson() {
        return agePerson;
    }

    public void setTravelKm(double travelKm) {
        this.travelKm = travelKm;
    }

    public void setAgePerson(double agePerson) {
        this.agePerson = agePerson;
    }


    // METODI
    public double calculatePrice(double resultPrice){
        if (agePerson < 18){
            //Se l'età è minore di 18 anni allora:
            resultPrice = (travelKm * priceForKm) * discountUnder18;
        } else if(agePerson > 65) {
            //Se l'età è maggiore di 65 anni allora:
            resultPrice =  (travelKm * priceForKm) * discountOver65;
        }else {
            resultPrice = travelKm * priceForKm;
        }
        return resultPrice;
    }
}
