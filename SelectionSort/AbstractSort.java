package homework4SelectionSort;

public class AbstractSort {


	public static boolean less(IPAddress ipAddresses, IPAddress ipAddresses2) {
		return false;
	}
	
	
	public static void swap (IPAddress[] ipAddresses, int a, int b) {
		IPAddress tmp = ipAddresses[a];
		ipAddresses[a] = ipAddresses[b];
		ipAddresses[b] = tmp;
	}
	
}
