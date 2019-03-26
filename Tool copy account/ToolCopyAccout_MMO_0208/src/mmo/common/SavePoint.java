package mmo.common;

import java.io.File;
import java.util.Map;
import mmo.file_io.SavePointIO;
import mmo.model.SavePointModel;

public class SavePoint {

    public static void addSavePoint(File filePath) {
        String path = filePath.toString().concat(".txt");
        String name = path.substring(path.lastIndexOf("\\") + 1);
        SavePointIO savePointIO = new SavePointIO();
        Map<String, SavePointModel> map = savePointIO.readMap(Common.SAVE_POINT);
        map.put(name, new SavePointModel(name, path, 0));
        savePointIO.writeMap(map, Common.SAVE_POINT);
    }
}
