package designpatterns.Creational.Builder;

public class Student {

    private int id;
    private String name;
    private String address;
    private String course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    Student(int id, String name, String address, String course){
        this.id=id;
        this.name=name;
        this.address=address;
        this.course=course;
    }


    public static class StudentBuilder{
        private int id;
        private String name;
        private String address;

        private String course;

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getCourse() {
            return course;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Student build(){
            return new Student(this.id,this.name,this.address,this.course);
        }


    }
}
