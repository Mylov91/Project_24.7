package ru.mylov;

public class Student {
    private String fullName;
    private String universityId;
    private int currentCourseNumber;
    private float avgExamScore;


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    @Override
    public String toString() {
        return "Name of student: " + getFullName() + ", unversity ID: " + getUniversityId() +
                ", current course number: " + getCurrentCourseNumber() + ", average exam score: " + getAvgExamScore() + ".";
    }
}

