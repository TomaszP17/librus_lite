public class Student extends User{
    private static int counter = 0;
    private int studentId;
    private StudyYear studyYear;
    private Course course;
    private Specialization specialization;

    public Student(String pesel, String firstName, String lastName, int age, String email, String phone, int studentId,
                   StudyYear studyYear, Course course, Specialization specialization) {
        super(pesel, firstName, lastName, age, email, phone);
        this.studentId = studentId;
        this.studyYear = studyYear;
        this.course = course;
        this.specialization = specialization;

        counter++;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public StudyYear getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(StudyYear studyYear) {
        this.studyYear = studyYear;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studyYear=" + studyYear +
                ", course=" + course +
                ", specialization=" + specialization +
                '}';
    }
}
