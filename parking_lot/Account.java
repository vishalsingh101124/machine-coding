import enums.AccountStatus;

public abstract class Account {

    protected String userName;
    protected String password;
    protected AccountStatus status;
    protected Person person;

    public Account(String userName, String password, AccountStatus status, Person person) {
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.person = person;
    }

    public boolean resetPassword(String newPassword) {
        this.password = newPassword;
        return true;
    }
}
