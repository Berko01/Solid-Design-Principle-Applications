public class Main {
    public static void main(String[] args) {
        Oracle oracle = new Oracle();

        log4j  log4j = new log4j("Hello world.");

        PrintConsole printConsole = new PrintConsole();
        PrintDatabase printDatabase = new PrintDatabase(oracle);

        printConsole.print(log4j);
        printDatabase.print(log4j);
    }
}
