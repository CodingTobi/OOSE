package Uebungsblatt6;

class GeometricObject {
	Vertex corner;
	double width;
	double height;
	Vertex velocity;

	public GeometricObject(Vertex corner, double width, double height, Vertex velocity) {
		super();
		this.corner = corner;
		this.width = width;
		this.height = height;
		this.velocity = velocity;
	}

	double size() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Geo(" + corner + "," + width + "," + height + "," + velocity + ")";
	}
}
