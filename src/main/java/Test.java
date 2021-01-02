import com.password4j.Password;

public class Test {
    public static void main(String[] args) {
        String hash = "$2b$12$fRnFJP6V1PybWlgvGYYeEutnpgtmYPBy94UPwpKfH2J5GbxA22cFC";
        String password = "1234";
        boolean verified = Password.check(password, hash).withBCrypt();

        System.out.println(verified);
    }
}
