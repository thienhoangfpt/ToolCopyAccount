package mmo.model;

import java.io.Serializable;

public abstract class BaseModel implements Serializable {

    private Integer id;

    public BaseModel() {
    }

    public BaseModel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public abstract String formatData();

}
