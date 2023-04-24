package ru.mylov;

public class UniversityBuilderImpl implements UniversityBuilder{
    University university = new University();

    @Override
    public UniversityBuilder createId(String id) {
        university.setId(id);
        return this;
    }

    @Override
    public UniversityBuilder createFullName(String fullName) {
        university.setFullName(fullName);
        return this;
    }

    @Override
    public UniversityBuilder createShortName(String shortName) {
        university.setShortName(shortName);
        return this;
    }

    @Override
    public UniversityBuilder createYearOfGoundation(int yearOfFoundation) {
        university.setYearOfFoundation(yearOfFoundation);
        return this;
    }

    @Override
    public UniversityBuilder createStudyProfile(StudyProfile studyProfile) {
        university.setMainProfile(studyProfile);
        return this;
    }

    @Override
    public University build() {
        return university;
    }
}

