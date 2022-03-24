package Week18;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// populate with the names of six family members
		list.add("Aidan");
		list.add("Claire");
		list.add("Niamh");
		list.add("Una");
		list.add("Annie");

		Queue<String> myQ = new PriorityQueue<>();

		// dequeue every 3 seconds
		while (!myQ.isEmpty()) {
			System.out.println("Dequeue .. ");
			System.out.println(myQ.poll());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Queue empty");
	}
}