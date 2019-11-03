package Uebungsblatt3;

class Time {
	int hour;
	int minute;
	int second;

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public boolean isEarlierThan(Time that) {
		if (this.hour < that.hour) {
			return true;
		} else if (this.hour == that.hour) {
			if (this.minute < that.minute) {
				return true;
			} else if (this.minute == that.minute) {
				if (this.second < that.second) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isLaterThan(Time that) {
		if (this.hour > that.hour) {
			return true;
		} else if (this.hour == that.hour) {
			if (this.minute > that.minute) {
				return true;
			} else if (this.minute == that.minute) {
				if (this.second > that.second) {
					return true;
				}
			}
		}
		return false;
	}

	public Time minutesLater(int min) {
		if ((this.minute + min) < 60) {
			return new Time(this.hour, (this.minute + min), this.second);
		} else {
			int tempH = (int) this.hour + ((this.minute + min) / 60);
			return (tempH < 24)
					? new Time(tempH, ((this.minute + min) % 60), this.second)
					: new Time(tempH - 24, ((this.minute + min) % 60),
							this.second);
		}
	}

	public String toString() {
		return hour + ":" + minute + " Uhr";
	}

	public static void main(String[] args) {
		Time t1 = new Time(12, 50, 15);
		Time t2 = new Time(12, 59, 14);
		Time t3 = new Time(11, 59, 14);
		System.out.println(t1.toString());

	}
}

//
//System.out.println(t2.isEarlierThan(t1)); // true
//System.out.println(t3.isEarlierThan(t1)); // true
//System.out.println(t2.isLaterThan(t1)); // false
//System.out.println(t3.isLaterThan(t1)); // false
//System.out.println(t1.minutesLater(5)); // 12,55,15
//System.out.println(t1.minutesLater(25));// 13,05,15
