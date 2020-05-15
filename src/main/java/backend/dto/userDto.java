package backend.dto;

public class userDto {
    private String firstName;
    private String secondName;
    private String emailAddress;
    private String passWord;
    private String passWordAgain;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWordAgain() {
        return passWordAgain;
    }

    public void setPassWordAgain(String passWordAgain) {
        this.passWordAgain = passWordAgain;
    }
}
