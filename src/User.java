public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = this.reversePassword(password);
    }

    public User login(String email, String password) {
        boolean isEmailCorrect = this.email == email;

        boolean isPasswordCorrect = this.checkPassword(password);
        if (isEmailCorrect && isPasswordCorrect) {
            return this;
        }

        throw new Error("Email or password was wrong");
    }

    private int reversePassword(String password) {
        String nstr ="";
        char ch;
       
        for (int i = 0; i < password.length(); i++)
        {
            ch = password.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }

    private boolean checkPassword(String password) {
        String reverse = this.reversePassword(password);
        if (reverse.contentEquals(this.password)) {
            return true;
        }

        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = this.reversePassword(password);
    }

}
