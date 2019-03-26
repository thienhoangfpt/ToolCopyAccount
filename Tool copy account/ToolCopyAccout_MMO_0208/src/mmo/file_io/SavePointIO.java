package mmo.file_io;

import mmo.base.BaseFileIO;
import mmo.file_io.type.ProcessSavePointObjectIO;

import mmo.model.SavePointModel;

public final class SavePointIO extends BaseFileIO<SavePointModel> {

    public SavePointIO() {
        super.setTypeIO(new ProcessSavePointObjectIO());
    }

}
