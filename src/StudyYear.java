public enum StudyYear implements EnumListener{
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5),
    TEACHER(0);

    private final int year;
    StudyYear(int year) {
        this.year = year;
    }
}
