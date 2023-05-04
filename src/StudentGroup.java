import java.util.ArrayList;

public class StudentGroup {
    private Student leader;
    private final ArrayList<Student> studentList;
    private final ArrayList<String> taskList;

    public StudentGroup(ArrayList<Student> studentList, Student leader) {
        this.studentList = studentList;
        this.leader = leader;
        this.taskList = new ArrayList<>();
        this.addStudentIfNotInGroup(this.leader);
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }
    public void removeStudent(Student student) {
        if (this.studentList.size() == 1) {
            return;
        }
        if (student.getId() == this.leader.getId()) {
            this.studentList.remove(student);
            this.leader = this.studentList.get(0);
        }
    }
    public void renameStudent(Student student, String newFirstName, String newLastName) {
        if (this.studentList.contains(student)) {
            student.setFirstName(newFirstName);
            student.setLastName(newLastName);
        }
    }
    public void addTask(String task) {
        this.taskList.add(task);
    }
    public void removeTask(String task) {
        this.taskList.remove(task);
    }
    public void changeLeader(Student newLeader) {
        this.addStudentIfNotInGroup(newLeader);
        this.leader = newLeader;
    }
    private void addStudentIfNotInGroup(Student student) {
        if (!this.studentList.contains(student)) {
            this.studentList.add(student);
        }
    }

    public void printStudentGroup() {
        for (Student student: this.studentList) {
            System.out.print(student.getFirstName() + " " + student.getLastName() + " id: " + student.getId());
            if (student.getId() == this.leader.getId()) {
                System.out.println(" - leader");
            } else {
                System.out.println();
            }
        }
    }

    public void printTaskList() {
        for (String task: this.taskList) {
            System.out.println(task);
        }
    }
    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }
    public ArrayList<String> getTaskList() {
        return this.taskList;
    }


}
