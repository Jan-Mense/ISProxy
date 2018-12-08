import java.util.Scanner;

public class UserShell {
    private final HttpClient http_client;
    private final LogFileReader logfile_reader;
    private final Scanner scanner = new Scanner(System.in);
    private final String menu_text = 
        "1-                                                        \n"+
        "2-\"date\"-> data for this Date(yyyy:mm:dd)                \n"+
        "3-all\t->                                                  ";

    public UserShell(HttpClient pHttpClient, LogFileReader pLogFileReader) {
        http_client = pHttpClient;
        logfile_reader = pLogFileReader;
    }

    public void run() {
        while(true) {
            System.out.println(menu_text);
            if(scanner.hasNext()) {
                if(!scanner.hasNextInt()) {
                    scanner.next();
                } else {
                    switch(scanner.nextInt()) {
                        case 1:
                            choiceOne();
                            break;
                        case 2:
                            choiceTwo();
                            break;
                        case 3:
                            choiceThree();
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    private void choiceOne() {
        System.out.println("SAFE CHOICE ONE");
    }

    private void choiceTwo() {
        System.out.println("SAFE CHOICE TWO");
    }

    private void choiceThree() {
        System.out.println("SAFE CHOICE THREE");
    }
}
