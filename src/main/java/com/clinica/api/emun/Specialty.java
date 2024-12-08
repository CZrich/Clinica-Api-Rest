package com.clinica.api.emun;

public enum Specialty {

    ODONTOLOGY("odontology"),
    SURGEON("surgeon"),
    CARDIOLOGIST("cardiologist"),
    ORTHOPEDICS("orthopedics"),
    GYNECOLOGY("gynecology"),
    PEDIATRICIAN("pediatrician");

    private final String  specialtyLower;

    Specialty( String s){
        this.specialtyLower=s;
    }
    public String getSpecialtyLower(){
        return this.specialtyLower;
    }

    public static Specialty fromLowerString(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        for (Specialty specialty : Specialty.values()) {
            if (specialty.getSpecialtyLower().equalsIgnoreCase(s)) {
                return specialty;
            }
        }

        throw new IllegalArgumentException("No matching Specialty for: " + s);
    }

    @Override
    public String toString() {
        return this.specialtyLower;
    }


}
