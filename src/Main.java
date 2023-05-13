import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Teacher elizabeth = new Teacher(1,"Elizabeth",1100);
        Teacher sam = new Teacher(2,"Sam",950);
        Teacher ven = new Teacher(3,"Ven",1300);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(elizabeth);
        teacherList.add(sam);
        teacherList.add(ven);


        Student bob = new Student(1,"Bob",9);
        Student dave = new Student(2,"Dave",4);
        Student mac = new Student(3,"Mac",12);
        List<Student> studentList = new ArrayList<>();

        studentList.add(bob);
        studentList.add(dave);
        studentList.add(mac);




        School owl = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        owl.addTeacher(megan);


        bob.payFees(5000);
        dave.payFees(6000);
        System.out.println("OWL has earned $"+ owl.getTotalMoneyEarned());

        System.out.println("school/pay salary:");
        elizabeth.receiveSalary(elizabeth.getSalary());
        System.out.println("OWL has paid for salary to " + elizabeth.getName()
                +" and now has $" + owl.getTotalMoneyEarned());

        ven.receiveSalary(ven.getSalary());
        System.out.println("OWL has paid for salary to " + ven.getName()
                +" and now has $" + owl.getTotalMoneyEarned());

        System.out.println(dave);
        sam.receiveSalary(sam.getSalary());
        System.out.println(sam);
    }
}