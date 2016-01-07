public class Cylinder implements Shape{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height){
		this.radius = radius;
		this.height = height;
	}
	
	public double getVolume() {
		double volume = Math.PI * Math.pow(this.radius, 2) * this.height;
		return volume;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * Math.pow(this.radius, 2));
		return surfaceArea;
	}
}
