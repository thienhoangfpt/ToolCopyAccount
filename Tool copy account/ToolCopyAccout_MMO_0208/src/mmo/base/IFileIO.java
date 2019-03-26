package mmo.base;

import java.util.List;
import java.util.Map;

public interface IFileIO<T> {

    public T readFromFile(String filePath);

    public boolean writeToFile(String filePath, T t);

    public List<T> readListDataFromFile(String filePath);

    public boolean writeListDataToFile(String filePath, List<T> t, boolean isAppened);

    public Map<String, T> readMapDataToFile(String filePath);

    public boolean writeMapDataToFile(String filePath, Map<String, T> map);

}
