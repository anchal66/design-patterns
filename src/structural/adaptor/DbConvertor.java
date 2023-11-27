package structural.adaptor;

import java.util.List;

public interface DbConvertor {
    List<DisplayData> convert(List<DbData> dbData);
}
