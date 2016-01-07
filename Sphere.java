public class Sphere implements Shape{
	private double radius;
	
	public Sphere(double radius){
		this.radius = radius;
	}
	
	public double getVolume() {
		double volume = (4/3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}
}
