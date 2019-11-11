package Uebungsblatt3;

public class Appointment {
	DateTime time;
	int length;
	String reason;
	String place;

	Appointment(DateTime time, int length, String reason, String place) {
		this.time = time;
		this.length = length;
		this.reason = reason;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Ihr Termin:\nDatum: " + this.time.toString() + "\nDauer: "
				+ length + " Minuten\nTyp:   " + reason + "\nOrt:   " + place;
	}

	public DateTime endingTime() {
		Time t = time.time;
		Date d = time.date;
		t.minute = (time.time.minute + length);
		if (t.minute > 60) {
			t.hour += t.minute / 60;
			t.minute %= 60;
			if (t.hour >= 24) {
				d.day += t.hour / 24;
				t.hour %= 24;
			}
		}
		return new DateTime(d, t);
		
	}

	public static void main(String[] args) {
		Date d = new Date(14,7,1789);
		Time t = new Time(13, 22, 56);
		DateTime dt = new DateTime(d, t);
		Appointment ap = new Appointment(dt, 45, "Zahnartzt", "Burgstraﬂe 4");
		System.out.println(ap.endingTime().toString());
	}
}