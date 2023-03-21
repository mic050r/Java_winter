package thread.slideshow;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageThread extends Thread {
	JLabel lbl;
	int time = 1000;
	
	public ImageThread(JLabel lbl) {
		this.lbl = lbl;
	}
	
	
	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	@Override
	public void run() {
		int i = 1;
		ImageIcon icon;
		while(true) {
			icon = new ImageIcon("imgs/yeonJun" + i++ + ".jpg" );
			lbl.setIcon(icon);
			if(i == 5) {
				i = 1;
			}
			try {
				sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
