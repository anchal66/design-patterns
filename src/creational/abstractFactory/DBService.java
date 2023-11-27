package creational.abstractFactory;

public class DBService implements Service{
    @Override
    public String runService() {
        return "DB Service";
    }
}
