package mmo.model;

public final class AccountModel extends BaseModel {

    private String username;
    private String password;
    private String phoneNumber;

    public AccountModel() {
        super(-1);
    }

    public AccountModel(Integer id, String username, String password, String phoneNumber) {
        super(id);
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return username;
    }

    @Override
    public String formatData() {
        return super.getId() + "|" + username + "|" + password + "|" + phoneNumber;
    }

}
