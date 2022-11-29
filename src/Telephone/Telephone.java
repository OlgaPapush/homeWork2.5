package Telephone;

import Passport.Passport;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Telephone {
    private final Map<FullName, String > book = new HashMap<>();
    public void addPhone(FullName fullName, String phone){
        book.put(fullName, phone);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "book=" + book +
                '}';
    }
}
