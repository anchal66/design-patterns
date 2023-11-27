package creational.abstractFactory;

public class DBFactory implements DataSourceAbstractFactory{
    @Override
    public Service createService() {
        return new DBService();
    }

    @Override
    public Response createResponse() {
        return new DBResponse();
    }
}
