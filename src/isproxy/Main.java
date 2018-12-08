import java.util.*;

class Main {
    public static void main(String[] args) {
        LogFileReader lfr = new LogFileReader();
        LogFileWriter lfw = new LogFileWriter();
        HttpClient hc = new HttpClient(lfw);
        UserShell usershell = new UserShell(hc,lfr);

        usershell.run();
  }
}