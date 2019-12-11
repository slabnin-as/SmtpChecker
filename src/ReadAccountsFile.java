import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAccountsFile {
    private List<String> accounts = new ArrayList<>();

    public ReadAccountsFile(String filename) {
        try (Scanner scanner = new Scanner(new FileInputStream(filename))) {
            while (scanner.hasNextLine()) {
                accounts.add(scanner.nextLine());
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден " + e.getMessage());
        }
    }

    public List<String> getAccounts(){
        return accounts;
    }
}
