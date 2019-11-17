package Uebungsblatt4;

class Date {
	int day;
	int month;
	int year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	int dayOfWeek() {
		if (month < 3) {
			year--;
		}
		int temp = (int) (((day + (2.6 * ((month + 9) % 12 + 1) - 0.2)
				+ year % 100 + (year % 100 / 4) + (year / 400)
				- 2 * (year / 100) - 1) % 7 + 7) % 7 + 1);
		return (temp == 7) ? 0 : temp;
	}

	int countMonth() {
		if (this.month == 1 || this.month == 3 || this.month == 5
				|| this.month == 7 || this.month == 8 || this.month == 10
				|| this.month == 12) {
			return 31;
		} else if (this.month == 2) {
			return (this.isLeapYear()) ? 29 : 28;
		} else {
			return 30;
		}
	}

	Date nextDay() {
		Date tempD = this;
		if (this.day < countMonth()) {
			tempD.day += 1;
			return tempD;
		} else {
			tempD.day = 1;
			if (this.month < 12) {
				tempD.month += 1;
				return tempD;
			} else {
				tempD.month = 1;
				tempD.year += 1;
				return tempD;
			}
		}
	}

//	String monthAsHTML(){
//		  <table>
//		  <tr><th>Mo</th><th>Di</th><th>Mi</th><th>Do</th><th>Fr</th><th>Sb</th><th>So</th></tr>
//		  <tr><td></td><td></td><td></td><td></td><td>1</td><td>2</td><td>3</td></tr>
//		  <tr><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td></tr>
//		  <tr><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td><td>16</td><td>17</td></tr>
//		  <tr><td>18</td><td>19</td><td>20</td><td>21</td><td>22</td><td>23</td><td>24</td></tr>
//		  <tr><td>25</td><td>26</td><td>27</td><td>28</td><td>29</td><td>30</td></tr>
//		</table>
//	  }

	Date mothersDay() {
		return null;
	}

	public boolean isEarlierThan(Date that) {
		if (this.year < that.year) {
			return true;
		} else if (this.year == that.year) {
			if (this.month < that.month) {
				return true;
			} else if (this.month == that.month) {
				if (this.day < that.day) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isLaterThan(Date that) {
		if (this.year > that.year) {
			return true;
		} else if (this.year == that.year) {
			if (this.month > that.month) {
				return true;
			} else if (this.month == that.month) {
				if (this.day > that.day) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isSameDate(Date that) {
		return (that.year == this.year && that.month == this.month
				&& that.day == this.day);
	}

	public boolean isLeapYear() {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else if (year % 400 != 0) {
			return false;
		}
		return true;
	}

	public int getAbsoluteDaysInYear() {
		return (isLeapYear()) ? 366 : 365;
	}

	public String toString() {
		return day + "." + month + "." + year;
	}

	public static void main(String[] args) {
		Date d1 = new Date(18, 11, 2019);
		System.out.println(d1.dayOfWeek());
		Date d2 = new Date(19, 11, 2019);
		System.out.println(d2.dayOfWeek());
		Date d3 = new Date(20, 11, 2019);
		System.out.println(d3.dayOfWeek());
		Date d4 = new Date(21, 11, 2019);
		System.out.println(d4.dayOfWeek());
		Date d5 = new Date(22, 11, 2018);
		System.out.println(d5.dayOfWeek());
		Date d6 = new Date(23, 11, 2019);
		System.out.println(d6.dayOfWeek());
		Date d7 = new Date(24, 11, 2019);
		System.out.println(d7.dayOfWeek());
		
		Date d10 = new Date(31,10,2019);
		System.out.println("Count month "+d10.countMonth() + " day " + d10.day);
		System.out.println(d10.nextDay().toString());
	}
}