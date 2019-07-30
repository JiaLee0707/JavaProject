package threadex;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;



class MyLabel extends JLabel implements Runnable{
	private Thread timerThread = null;
	public MyLabel() {
		setText(makeClockText());
		setFont(new Font("TimesRoman", Font.ITALIC, 80));
		setHorizontalAlignment(JLabel.CENTER);
		timerThread = new Thread(MyLabel.this);
		timerThread.start();
	}
	public String makeClockText() {
		Calendar ca= Calendar.getInstance();
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int second = ca.get(Calendar.SECOND);
		
		String clockText = Integer.toString(hour);
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(min));
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(second));
		
		return clockText;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
			setText(makeClockText());
		}
	}
}

public class Clock extends JFrame{
	public Clock() {
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new MyLabel());
		
		setSize(600,200);
		setLocation(500,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Clock();
	}
}
