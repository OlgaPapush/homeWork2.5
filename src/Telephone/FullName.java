package Telephone;

import java.util.Objects;

public class FullName {
    private final String name;
    private final String middleName;

    public FullName(String name, String middleName) {
        this.name = name;
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return name.equals(fullName.name) && middleName.equals(fullName.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middleName);
    }
}
