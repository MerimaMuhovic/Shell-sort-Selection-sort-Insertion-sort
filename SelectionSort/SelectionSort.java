package homework4SelectionSort;

	public class SelectionSort extends AbstractSort {
		
		
		public static void sort(IPAddress[] ipAddresses) {
			for (int i = 0; i < ipAddresses.length; i++) {				
				int min = i;										
				for (int j = i + 1; j < ipAddresses.length; j++) {		
					if (less(ipAddresses[j], ipAddresses[min])) {			
						min = j;									
					}
				}
				swap(ipAddresses, i, min);								
			}
		}
	}




