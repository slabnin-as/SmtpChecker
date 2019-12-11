import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;
import java.util.Random;

public class StartCheck implements Runnable{
    private List<String> accounts;

    public StartCheck(List<String> accounts){
        this.accounts = accounts;
    }

    public String getRandomString(){
        int index = new Random().nextInt(accounts.size());

        return accounts.get(index);
    }

    private void checkAccounts() throws IOException {
        String[] data = getRandomString().split(";");
        Socket socket = new Socket("smtp.sibnet.ru", 25);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
    }


    @Override
    public void run() {
        try {
            checkAccounts();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
