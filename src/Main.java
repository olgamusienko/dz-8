import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", "Brown");
        Student olha = new Student("Olha", "Musiienko");
        Student alex = new Student("Alex", "Stepanenko");
        ArrayList<Student> studentGroup = new ArrayList<>();
        studentGroup.add(john);
        studentGroup.add(olha);
        studentGroup.add(alex);
        StudentGroup group = new StudentGroup(studentGroup, olha);
        System.out.println("Initial state of the group:");
        group.printStudentGroup();
        Student marry = new Student("Marry", "Stewart");
        group.addStudent(marry);
        System.out.println("State of the group after adding a new student:");
        group.printStudentGroup();
        group.renameStudent(olha, "Olha", "Kim");
        System.out.println("State of the group after renaming a student:");
        group.printStudentGroup();
        group.removeStudent(olha);
        System.out.println("State of the group after removing a student:");
        group.printStudentGroup();
        group.changeLeader(marry);
        System.out.println("State of the group after changing a leader:");
        group.printStudentGroup();
        System.out.println("Task list before adding anything:");
        group.printTaskList();
        System.out.println();
        group.addTask("Learn encapsulation");
        group.addTask("Learn abstraction");
        group.addTask("Learn inheritance");
        System.out.println("Task list after adding some tasks:");
        group.printTaskList();
        group.removeTask("Learn encapsulation");
        System.out.println("Task list after removing a task:");
        group.printTaskList();
    }
}