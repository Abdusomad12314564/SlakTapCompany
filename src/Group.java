import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String groupName;
    private LocalDate startDate;
    private String mentor;
    private Student [] students;

    public Group(String groupName, LocalDate startDate, String mentor, Student[] students) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return groupName + " Башталган күнү: " + startDate + " Ментор: " + mentor + "\nСтуденттер: " + Arrays.toString(students);
    }
}
