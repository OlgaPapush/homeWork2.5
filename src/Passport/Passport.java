package Passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String name;
    private final String lastName;
    private final String middleName;
    private final LocalDate localDate;

    public Passport(int number, String name, String lastName, String middleName, LocalDate localDate) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.localDate = localDate;
    }

    public static void addPassport(Passport passport) {
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
