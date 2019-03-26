package mmo.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import mmo.model.AccountModel;

public final class DatasSource {

    public static final List<String> PHONE_NUMBERS = new LinkedList<>();
    public static final Map<Integer, String> LIST_WORDS = new HashMap<>();
    public static final Random RANDOM = new Random();
    public static int TOTAL_ACCOUNT = 0;
    public static final List<AccountModel> SAVED_ACCOUNTS = new LinkedList<>();
    public static int LAST_RUN = 0;
    public static String CURRENT_FILE;
    public static int NEW_RUN;
    private static DatasSource datasSource = null;
    public static String CAPCHA_PATH;

    private DatasSource() {

    }

    public static DatasSource getInstance() {
        synchronized (DatasSource.class) {
            if (datasSource == null) {
                datasSource = new DatasSource();
            }
        }
        return datasSource;
    }

    public void loadData() {
        loadListName();
        loadPhones();
    }

    private void loadPhones() {
        // read data source for word random
        try (BufferedReader br
                = new BufferedReader(new InputStreamReader(new FileInputStream(new File("phones.txt"))))) {
            String line;
            Integer idx = 0;
            // read line by line from file
            while ((line = br.readLine()) != null) {
                PHONE_NUMBERS.add(line);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void loadListName() {
        // read data source for word random
        try (BufferedReader br
                = new BufferedReader(new InputStreamReader(new FileInputStream(new File("account.txt"))))) {
            String line;
            Integer idx = 0;
            // read line by line from file
            while ((line = br.readLine()) != null) {
                LIST_WORDS.put(idx++, line);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
