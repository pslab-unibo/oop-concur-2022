package oop.concur;

import org.fusesource.jansi.Ansi.Color;

public class CountDownAgent extends Thread {

	private int countDown;
	
	public CountDownAgent(int startingCount) {
		countDown = startingCount;
	}
	
	public void run() {
		Screen sc = Screen.getInstance();
		while (countDown > 1) {
			sc.writeStringAt(1, 1, Color.WHITE, "In " + countDown + " seconds the sentence below will fall...");
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			countDown--;
		}
		sc.writeStringAt(1, 1, Color.WHITE, "In " + countDown + " second the sentence below will fall...");
	}
}
