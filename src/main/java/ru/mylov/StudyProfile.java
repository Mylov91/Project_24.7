package ru.mylov;

public enum StudyProfile {
    MEDICINE("Медицина"), JOURNALISM("Журналистика"), JURISPRUDENCE("Юриспруденция");

    String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

}

