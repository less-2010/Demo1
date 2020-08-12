package day23.se04.StudentManageSystem;

public class Admin {
    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getUsePassword() {
        return usePassword;
    }

    public void setUsePassword(String usePassword) {
        this.usePassword = usePassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "useName='" + useName + '\'' +
                ", usePassword='" + usePassword + '\'' +
                '}';
    }

    String useName;
    String usePassword;

    public Admin(String useName, String usePassword) {
        this.useName = useName;
        this.usePassword = usePassword;
    }
}
