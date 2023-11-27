package structural.adaptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DbData> dbDatas = new ArrayList<>(Arrays.asList(new DbData(1, 5), new DbData(2, 8)));
        DbConvertor dbConvertor = new DisplayDataAdaptor();
        List<DisplayData> displayDatas = dbConvertor.convert(dbDatas);
        System.out.println(displayDatas);
    }
}
