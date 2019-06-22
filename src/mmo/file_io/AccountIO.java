package mmo.file_io;

import mmo.file_io.type.ProcessAccountTextIO;
import mmo.base.BaseFileIO;
import mmo.base.IFileIO;
import mmo.model.AccountModel;

public final class AccountIO extends BaseFileIO<AccountModel> {

    public AccountIO(IFileIO fileIO) {
        super.setTypeIO(fileIO);
    }

    public AccountIO() {
        super.setTypeIO(new ProcessAccountTextIO());
    }

}
