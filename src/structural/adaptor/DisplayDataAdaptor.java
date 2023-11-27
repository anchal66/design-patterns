package structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdaptor implements DbConvertor{
    @Override
    public List<DisplayData> convert(List<DbData> dbData) {
        List<DisplayData> displayDatas = new ArrayList<>();
        for (DbData dbData1 : dbData){
            float index = dbData1.getPosition();
            String position = Integer.toString(dbData1.getAmount());
            displayDatas.add(new DisplayData(index, position));
        }
        return displayDatas;
    }
}
