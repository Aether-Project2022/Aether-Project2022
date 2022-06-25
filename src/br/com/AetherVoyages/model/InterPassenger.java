
package br.com.AetherVoyages.model;


public class InterPassenger extends Passenger{
    private String passport;

    public InterPassenger() {
    }
    
    public InterPassenger(String passport, int code, String name, String rg, String cpf, String email, String destiny, String boarding, int flightId) {
        super(code, name, rg, cpf, email, destiny, boarding, flightId);
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    
}
