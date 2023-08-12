public interface EnumListener {
    static <T extends Enum<T>> T[] getAllValues(Class<T> enumClass){
        return enumClass.getEnumConstants();
    }
}
