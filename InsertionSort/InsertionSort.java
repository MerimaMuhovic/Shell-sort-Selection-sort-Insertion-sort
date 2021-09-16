package homework4InsertionSort;


	public class InsertionSort extends AbstractSort {
		
	
		
		public static void sort(IPAddress[] ipAddresses) {
			
			for (int i = 0; i < ipAddresses.length; i++) {	
				
				for (int j = i; j > 0; j--) {		
					
					if (less(ipAddresses[j], ipAddresses[j - 1])) {		
						swap(ipAddresses, j, j - 1);					
					}
					else {
						break;										
					}
				}
			}
		}

		

		
	}




