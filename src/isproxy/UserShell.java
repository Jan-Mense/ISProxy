import java.util.Scanner;

public class UserShell {
    private final HttpClient http_client;
    private final LogFileReader logfile_reader;
    private final Scanner scanner = new Scanner(System.in);
    private final String menu_text = 
        "1\t-> display traffic for date yyyy/mm/dd\n"+
        "2\t-> display sum of traffic since logging began\n"+
        "3\t-> enter URL (send a http request) to insert a line into logfile.txt\n"+
        "^-C\t-> quit/exit";

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
        http_client.TrafficForDate();
    }

    private void choiceTwo() {
        http_client.SumOfEntireTraffic();
    }

    private void choiceThree() {
        http_client.InteractiveUrl();
    }
}
