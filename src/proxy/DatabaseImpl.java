package proxy;

public class DatabaseImpl implements IDatabase {
    private final String name = "MyDB";
    @Override
    public String connect() {
        return name;
    }
}
