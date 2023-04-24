package ru.mylov;

public interface UniversityBuilder {
    UniversityBuilder createId(String id);
    UniversityBuilder createFullName(String fullName);
    UniversityBuilder createShortName(String shortName);
    UniversityBuilder createYearOfGoundation(int yearOfFoundation);
    UniversityBuilder createStudyProfile(StudyProfile studyProfile);
    University build();
}

