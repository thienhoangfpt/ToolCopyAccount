package mmo.file_io.type;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mmo.base.BaseFileIO;
import mmo.base.IFileIO;
import mmo.model.AccountModel;

public final class ProcessAccountTextIO implements IFileIO<AccountModel> {

    public ProcessAccountTextIO() {
    }

    @Override
    public List<AccountModel> readListDataFromFile(String filePath) {
        List<AccountModel> accountModels = new LinkedList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));
            String line;
            // load data line by line from file text
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\|");
                // First tokens is id
                Integer id = Integer.parseInt(tokens[0]);
                // Second tokens is username
                String username = tokens[1].trim();
                // Third is password
                String password = tokens[2].trim();
                // Then last is phone number
                String phoneNumber = tokens[3].trim();
                // Declare new account model
                AccountModel accountModel
                        = new AccountModel(id, username, password, phoneNumber);
                // add account model to linked list
                accountModels.add(accountModel);
            }
        } catch (FileNotFoundException ex) {
            // exeption handle
            System.err.println(ex);
        } catch (IOException ex) {
            // exeption handle
            System.err.println(ex);
        } finally {
            BaseFileIO.close(br);
        }
        return accountModels;
    }

    @Override
    public boolean writeListDataToFile(String filePath, List<AccountModel> accounts, boolean isAppend) {
        // if nothing to write return false
        if (accounts.size() < 1) {
            return false;
        }
        // if has datas to write
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath, isAppend)));
            for (AccountModel a : accounts) {
                pw.println(a.formatData());
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            BaseFileIO.close(pw);
        }
        return pw != null;
    }

    @Override
    public AccountModel readFromFile(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeToFile(String filePath, AccountModel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, AccountModel> readMapDataToFile(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean writeMapDataToFile(String filePath, Map<String, AccountModel> map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
