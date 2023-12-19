package ru.itis.inf301;

public enum Gender {
    male, female;

    String getFullName() {
        switch (this) {
            case male:
                return "Мужской";
            case female:
                return "Женский";
        }
        return "Неопределён";
    }
}

