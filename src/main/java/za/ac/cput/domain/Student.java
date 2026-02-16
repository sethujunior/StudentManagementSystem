package za.ac.cput.domain;
    public abstract class Student {

        protected String studentId;
        protected String name;
        protected String email;
        protected String department;

        public Student() {}
        public Student(Builder builder) {
            this.studentId = builder.studentId;
            this.name = builder.name;
            this.email = builder.email;
            this.department = builder.department;
        }

        public String getStudentId() {
            return studentId;
        }
        public String getName() {

            return name;
        }
        public String getEmail() {
            return email;
        }
        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "studentId='" + studentId + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }

        public abstract double calculateTuition();
        public abstract String getStudentType();
        public void displayStudentDetails(){
            System.out.println(this);
        };

        //Bulder class
        public static abstract class Builder {
            private String studentId;
            private String name;
            private String email;
            private String department;

            public Builder setStudentId(String studentId) {
                this.studentId = studentId;
                return this;
            }

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setEmail(String email) {
                this.email = email;
                return this;
            }

            public Builder setDepartment(String department) {
                this.department = department;
                return this;
            }

            public Builder copy(Student students) {
                this.studentId = students.studentId;
                this.name = students.name;
                this.email = students.email;
                this.department = students.department;
                return this;
            }
            public abstract Student build();


        }
    }

