package za.ac.cput.domain;

public class GraduateStudent extends Student {
    private boolean researchAssistant;
    private String stipend;

    public GraduateStudent(){}
    //Builder constructor
    public GraduateStudent(Builder builder) {
        super(builder);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    public boolean getResearchAssistant() {
        return researchAssistant;
    }

    public String getStipend() {
        return stipend;
    }

    @Override
    public double calculateTuition() {
        return researchAssistant ? 0 : 500;
    }

    @Override
    public String getStudentType() {
        return "Graudate";
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: " + stipend);

    }

    //Builder class
    public static class Builder extends Student.Builder {
        private boolean researchAssistant;
        private String stipend;

        public Builder setResearchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }
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

        public Builder setStipend(String stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent.Builder copy(GraduateStudent grad) {
            this.researchAssistant = grad.researchAssistant;
            this.stipend = grad.stipend;
            return this;
        }
        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}


