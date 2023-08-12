public enum Course implements EnumListener{
    IT("Computer Science"),
    HR("Information management"),
    SNM("New media art"),
    KJ("Japan culture"),
    TEACHER(null);

    private final String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }
}
