package designpatterns.Creational.Builder;

public class Client {
    public static void main(String [] args){
        Student s1 = new Student.StudentBuilder().setId(1)
                            .setName("Ashwin")
                            .setAddress("Shimoga")
                            .setCourse("CS")
                            .build();
    }
}
