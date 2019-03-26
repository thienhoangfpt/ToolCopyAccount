package mmo.file_io.type;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mmo.base.BaseFileIO;
import mmo.base.IFileIO;
import mmo.model.SavePointModel;

public final class ProcessSavePointObjectIO implements IFileIO<SavePointModel> {

    @Override
    public SavePointModel readFromFile(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeToFile(String filePath, SavePointModel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SavePointModel> readListDataFromFile(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeListDataToFile(String filePath, List<SavePointModel> t, boolean isAppened) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, SavePointModel> readMapDataToFile(String filePath) {
        ObjectInputStream ois = null;
        File f = new File(filePath);
        Map<String, SavePointModel> map = new HashMap<>();
        if (!f.exists()) {
            return map;
        }
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            map = (Map<String, SavePointModel>) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        } finally {
            BaseFileIO.close(ois);
        }
        return map;
    }

    @Override
    public boolean writeMapDataToFile(String filePath, Map<String, SavePointModel> map) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(map);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            BaseFileIO.close(oos);
        }
        return oos != null;
    }

}
