package za.ac.cput;

import za.ac.cput.domain.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Students Section");
        System.out.println("--UNDERGRADUATE STUDENT--");
        UndergraduateStudent undergraduat = new UndergraduateStudent.Builder()
                .setStudentId("101")
                .setName("Sethu")
                .setEmail("230830811@")
                .setDepartment("IT")
                .setCreditHours(6)
                .setScholarshipAmount(200)
                .build();

        undergraduat.displayStudentDetails();
        System.out.println("--------------------------------------");

        System.out.println("--GRADUATE STUDENT--");
        GraduateStudent graduat = new GraduateStudent.Builder()
                .setStudentId("102")
                .setName("Naruto")
                .setEmail("224084971@")
                .setDepartment("Health")
                .setResearchAssistant(true)
                .setStipend("R5000")
                .build();
        graduat.displayStudentDetails();
    }
}

