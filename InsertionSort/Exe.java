package homework4InsertionSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Exe {

	public static void main(String[] args) throws IOException {
		String path = "C://Users//user//Desktop//DataStructure//IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		
		IPAddress[] ipAddresses = new IPAddress[10000];
		read(path, ipAddresses);
		
		InsertionSort.sort(ipAddresses);
		writeFile(path, ipAddresses);
		
		for(int i=0; i< ipAddresses.length; i++) {
			System.out.println(ipAddresses[i]);
		}
	}
	
	
	public static void read(String path, IPAddress[] array) throws FileNotFoundException {
		
        Scanner scanner = new Scanner(new File(path));
 
        
        for(int i =0; i < array.length; i++) {
        	String [] ipAddress = scanner.nextLine().split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");

        	for(int j=0; j< ipAddress.length; j++ ) {
        		ipAddress[j]= ipAddress[j].replaceAll("/ ", "");
        	}
        	
        	long ipFrom = Long.parseLong(ipAddress[0]);
        	long ipTo = Long.parseLong(ipAddress[1]);
        	String countryCode = ipAddress[2];
        	String countryName = ipAddress[3];
        	String region = ipAddress[4];
        	String city = ipAddress[5];
        	array[i]= new IPAddress(ipFrom, ipTo, countryCode, countryName, region, city);
        	
        }
        
      scanner.close();
      
}
	
	public static void writeFile(String path, IPAddress[]array) throws IOException{
		
		File file = new File(path);
		FileWriter writerFile= new FileWriter(file);
		
		for(int i=0; i < array.length ; i++) {
			writerFile.write(array[i].toString());
		}
		
		writerFile.close();
	}
	


	}

