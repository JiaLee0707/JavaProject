package pro2;

import java.util.*;

class Timer extends Thread{
	private static Thread timer = null;
	

	String Stime[] = new String[2];
	int[] Itime = new int[2];
	
	String clockText;
	
	public String after() {
		Itime[1]++;
		if(Itime[1] >= 60) {
			Itime[1]=0;
			Itime[0]++;
		}
		
		clockText = Integer.toString(Itime[0]);
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(Itime[1]));
		return clockText;	
	}
	
	public String first(String t) {
		String Stime[] = t.split(":");
		System.out.println("stime[0] : "+ Stime[0] + "stime[1]" + Stime[1]);
		for(int i=0; i<Stime.length; i++) {
			Itime[i] = Integer.parseInt(Stime[i]);
		}
		Itime[1]--;
		
		if(Itime[1] <= 0) {
			Itime[1]=60;
			Itime[0]--;
		}
		
		clockText = Integer.toString(Itime[0]);
		clockText = clockText.concat(":");
		clockText = clockText.concat(Integer.toString(Itime[1]));
		return clockText;	
	}

	public void run(String way, String time) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
			if(way.equals("후불")) {
				System.out.println(after());
			}
			else if(way.equals("선불")) {
				System.out.println(first(time));
			}
		}
	}
}