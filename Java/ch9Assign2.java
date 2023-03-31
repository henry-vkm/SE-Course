class ch9Assign2 
{
	public static void main (String[] args) {
		Time t1 = new Time(5, 46, 50);
		Time t2 = new Time(6, 30, 59);
		Time t3 = new Time();
		t3.thirdTime(t1, t2);
		t1.display();
		t2.display();
		
		t3.display();

	}
}

class Time 
{
	int hour;
	int minute;
	int second;
	
	public Time () {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	public Time (int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
		this.formatTime();
	}
	
	public void display () {
		System.out.println (hour + ":" + minute + ":" + second);
	}
	
	public void formatTime() {
		if (second >= 60) {
			minute += 1;
			second = second - 60;
		};
		
		if (minute >= 60) {
			hour += 1;
			minute = minute - 60;
		}
		
	}
	
	public void thirdTime(Time t1, Time t2) {
		hour = t1.hour + t2.hour;
		minute = t1.minute + t2.minute;
		second = t1.second + t2.second;
		
		this.formatTime();
	}	
}