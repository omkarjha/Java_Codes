public interface Online {

    String[] ERROR_CODES = { "404", "500", "503" };

    String search(String query);

    void open(String link);
}
