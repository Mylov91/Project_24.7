package ru.mylov;

public class Main {
    public static void main(String[] args) {

        Student student1 = new StudentBuilderImpl().createFullName("John Petrucci").createAvgExamScore(4.9F).createUniversityId("123A").build();
        System.out.println(student1);

        Student student2 = new StudentBuilderImpl().createFullName("Mike Portnoy").createAvgExamScore(4.6F).createUniversityId("115C").createCurrentCourseNumber(5).build();
        System.out.println(student2);

        University university1 = new UniversityBuilderImpl().createShortName("MGU").createStudyProfile(StudyProfile.JURISPRUDENCE).build();
        System.out.println(university1);

        University university2 = new UniversityBuilderImpl().createShortName("MMU").createFullName("Moscow Medical University").createStudyProfile(StudyProfile.MEDICINE).build();
        System.out.println(university2);
    }
}