public class Cube extends Prism{
	public double getVolume() {
		double volume = getHeight() * getLength() * getWidth();
		return volume;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = 6 * (Math.pow(getLength(), 2));
		return surfaceArea;
	}
}
