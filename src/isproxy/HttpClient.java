import java.util.*;
import java.net.*; 
import java.io.*;

public class HttpClient {
    private final LogFileWriter logfilewriter;
    private final Scanner scanner;
	private URL url;
	private String httpHeader;

    public HttpClient(LogFileWriter pLogfilewriter, Scanner scanner) {
        this.logfilewriter = pLogfilewriter;
        this.scanner = scanner;
    }

    public void trafficForDate() {
    	System.out.println("Eine Milliarde [b/kb/mb/gb/tb/pb]");
    }

    public void sumOfEntireTraffic() {
    	System.out.println("Eine Milliarde [b/kb/mb/gb/tb/pb]");
    }

    public void interactiveUrl() {
    	System.out.println("URL eingeben:");
		System.out.print("> ");
		url = new URL(scanner.nextLine().trim().toLowerCase());
		urlLookup();
		LogFileWriter(httpHeader);
    }
	
	private void urlLookup(){
		try {
			connection = url.openConnection();
			Map<String, List<String>> map = connection.getHeaderFields();
            
			for(Map.Entry<String, List<String>> entry: map.entrySet()){
				String t = new String(entry.getKey() + ": " + entry.getValue()+"; ");
				httpHeader += t;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
