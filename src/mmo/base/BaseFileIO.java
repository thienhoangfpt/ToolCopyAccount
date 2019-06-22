package mmo.base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class BaseFileIO<T> implements Serializable {

    private IFileIO<T> iFileIO;

    public BaseFileIO() {
    }

    public Map<String, T> readMap(String filePath) {
        return iFileIO.readMapDataToFile(filePath);
    }

    public boolean writeMap(Map<String, T> map, String filePath) {
        return iFileIO.writeMapDataToFile(filePath, map);
    }

    public void setTypeIO(IFileIO<T> iFileIO) {
        this.iFileIO = iFileIO;
    }

    public T read(String filePath) {
        return iFileIO.readFromFile(filePath);
    }

    public boolean write(String filePath, T t) {
        return iFileIO.writeToFile(filePath, t);
    }

    public List<T> readList(String filePath) {
        return iFileIO.readListDataFromFile(filePath);
    }

    public boolean writeList(String filePath, List<T> t, boolean isAppended) {
        return iFileIO.writeListDataToFile(filePath, t, isAppended);
    }

    public static void close(PrintWriter pw) {
        if (pw != null) {
            pw.close();
        }
    }

    public static void close(ObjectOutputStream oos) {
        try {
            if (oos != null) {
                oos.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void close(ObjectInputStream ois) {
        try {
            if (ois != null) {
                ois.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void close(BufferedReader br) {
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void close(BufferedWriter bw) {
        try {
            if (bw != null) {
                bw.close();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
