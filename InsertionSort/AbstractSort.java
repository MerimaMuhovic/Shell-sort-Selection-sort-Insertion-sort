package homework4InsertionSort;

public abstract class AbstractSort {
		
		

	public  static boolean less(IPAddress ipAddress, IPAddress ipAddress2) {
		
		return false;
	}
		
	
		public static void swap (IPAddress[] ipAddresses, int a, int b) {
			IPAddress tmp = ipAddresses[a];
			ipAddresses[a] = ipAddresses[b];
			ipAddresses[b] = tmp;
		}

	}


