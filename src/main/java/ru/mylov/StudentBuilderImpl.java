package ru.mylov;

class StudentBuilderImpl implements StudentBuilder {
    Student student = new Student();

    @Override
    public StudentBuilder createUniversityId(String universityId) {
        student.setUniversityId(universityId);
        return this;
    }

    @Override
    public StudentBuilder createCurrentCourseNumber(int currentCourseNumber) {
        student.setCurrentCourseNumber(currentCourseNumber);
        return this;
    }

    @Override
    public StudentBuilder createAvgExamScore(float avgExamScore) {
        student.setAvgExamScore(avgExamScore);
        return this;
    }

    @Override
    public StudentBuilder createFullName(String fullName) {
        student.setFullName(fullName);
        return this;
    }

    @Override
    public Student build() {
        return student;
    }
}

