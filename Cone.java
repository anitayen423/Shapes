public class Cone implements Shape{
	private double radius;
	private double slantHeight;
	private double height;
	
	public Cone(double radius, double slantHeight, double height){
		this.radius = radius;
		this.slantHeight = slantHeight;
		this.height = height;
	}
	
	public double getVolume() {
		double volume = (1/3) * Math.PI * Math.pow(this.radius, 2) * this.height;
		return volume;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = (Math.PI * this.radius * this.slantHeight) + (Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}
}
