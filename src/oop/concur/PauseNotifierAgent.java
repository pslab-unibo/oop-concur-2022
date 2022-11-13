package oop.concur;

import org.fusesource.jansi.Ansi.Color;

public class PauseNotifierAgent extends Thread {
	
	private long whenToPause;
	
	public PauseNotifierAgent(long whenToPause) {
		this.whenToPause = whenToPause;
	}
	
	public void run() {
		Screen sc = Screen.getInstance();
		delay(whenToPause + 200);
		sc.writeStringAt(1, 1, Color.WHITE, "A little synchronised pause for a snapshot...");
		delay(4000);
		sc.writeStringAt(1, 1, Color.WHITE, "                                             ");
	}
	
	private void delay(long dt) {
		try {
			Thread.sleep(dt);
		} catch (Exception ex) {}
	}
}
