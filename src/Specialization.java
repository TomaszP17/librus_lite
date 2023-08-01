public enum Specialization {
    A_BD("Bazy danych"),
    A_IO("Inżynieria oprogramowania i baz danych"),
    B("Cyberbezpieczeństwo, programowanie systemowe i sieciowe"),
    D("Inteligentne systemy przetwarzania danych"),
    E("Multimedia"),
    E_3D("Multimedia - Animacja 3D"),
    E_PG("Multimedia - Programowanie gier"),
    F("Robotyka"),
    G("Programowanie aplikacji biznesowych"),
    H("Sieci urządzeń mobilnych");

    private final String specializationName;

    Specialization(String specializationName) {
        this.specializationName = specializationName;
    }
}
