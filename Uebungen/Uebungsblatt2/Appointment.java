package Uebungsblatt2;

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

	public static void main(String[] args) {
		Date d = new Date(29, 11, 2018);
		Time t = new Time(12, 59, 15);
		DateTime dt = new DateTime(d, t);
		Appointment ap = new Appointment(dt, 60, "Zahnartzt", "Burgstraße 4");
		System.out.println(ap.toString());
	}
}