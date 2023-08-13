public class Teacher extends User{
    private static int counter = 0;

    private int teacherId;

    public Teacher(String pesel, String firstName, String lastName, int age, String email, String phone, int teacherId) {
        super(pesel, firstName, lastName, age, email, phone);
        this.teacherId = teacherId;

        counter++;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
