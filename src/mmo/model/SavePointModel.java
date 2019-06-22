package mmo.model;

public final class SavePointModel extends BaseModel {

    private String name;
    private String path;
    private Integer index;

    public SavePointModel() {

    }

    public SavePointModel(String name, String path, Integer index) {
        this.name = name;
        this.path = path;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String formatData() {
        return name + "|" + path;
    }

}
