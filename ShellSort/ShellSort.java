package homwork4ShellSort;


public class ShellSort extends AbstractSort {

	
	public static void sort(IPAddress[] ipAddresses) {
		int h = 1;														
		while (h < ipAddresses.length / 3) {							
			h = 3 * h + 1;											
		}
		
		while (h >= 1) {												
			for (int i = h; i < ipAddresses.length; i++) {					
				for (int j = i; j >= h; j -= h) {						
					if (less(ipAddresses[j], ipAddresses[j - h])) {			
						swap(ipAddresses, j, j - h);					
					} else {
						break;											
					}
				}
			}
			h = h / 3;													
		}
	}
}


