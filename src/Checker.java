public class Checker {
    public static void main(String[] args) {
        StartCheck check = new StartCheck(new ReadAccountsFile("input.txt").getAccounts());

        check.run();

    }
}
