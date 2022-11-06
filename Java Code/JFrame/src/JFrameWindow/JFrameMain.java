package JFrameWindow;

import javax.swing.*;

public class JFrameMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameOne frame1 = new JFrameOne();
				
				JFrameTwo frame2 = new JFrameTwo();
			}
		});
	}
}