package proxy;

public class DatabaseProxy implements IDatabase {

    private final IDatabase database;
    private final String name = "localhost:port/";

    public DatabaseProxy(IDatabase database) {
        this.database = database;
    }
    @Override
    public String connect() {
        return name + database.connect();
    }
}
