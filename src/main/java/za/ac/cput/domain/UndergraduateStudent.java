package za.ac.cput.domain;

public class UndergraduateStudent extends Student{
    private double creditHours;
    private double scholarshipAmount;
    public UndergraduateStudent(){}
    // Builder constractor
    private UndergraduateStudent(Builder builder) {
        super(builder);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        return  (creditHours*100) - scholarshipAmount;
    }
    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Credit hours: " + creditHours);
        System.out.println("Scholarship amount: " + scholarshipAmount);
    }

    //Builder class
    public static class Builder extends Student.Builder{
        private double creditHours;
        private double scholarshipAmount;
        @Override
        public Builder setStudentId(String studentId) {
            super.setStudentId(studentId);
            return this;
        }

        @Override
        public Builder setName(String name) {
            super.setName(name);
            return this;
        }

        @Override
        public Builder setEmail(String email) {
            super.setEmail(email);
            return this;
        }

        @Override
        public Builder setDepartment(String department) {
            super.setDepartment(department);
            return this;
        }

        public Builder setCreditHours(double creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }
        public UndergraduateStudent.Builder copy(UndergraduateStudent undergrad) {
            this.creditHours = undergrad.creditHours;
            this.scholarshipAmount = undergrad.scholarshipAmount;
            return this;
        }
        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }


}

