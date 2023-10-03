package java_hometask_1_problem_1;

public class MathCalc
{
	public static void main(String[] args)
	{
		double radius = 0.0;
		double circleArea = 100.0;
		int feet = 0;
		int inches = 0;
		radius = Math.sqrt(circleArea / Math.PI);
		feet = (int) Math.floor(radius);
		inches = (int) Math.round(12.0 * (radius - feet));
		System.out.println("The radius of a circle with area " + circleArea + " square feet is\n " + feet + " feet "
				+ inches + " inches");

		// Exercise starts
		double sun_diameter = 865000.0;
		double earth_diameter = 7600.0;

		// Part a - volume of earth
		double earth_volume = (4 * Math.PI * Math.pow((earth_diameter / 2), 3)) / 3;

		// Part b - volume of sun
		double sun_volume = (4 * Math.PI * Math.pow((sun_diameter / 2), 3)) / 3;

		// Part c - ratio of volumes
		double ratio = sun_volume / earth_volume;

		System.out.println("The volume of the earth is " + earth_volume + " cubic miles,\n"
				+ "the volume of the sun is " + sun_volume + " cubic miles\n"
				+ "and the ratio of the volume of the sun to the volume of the earth is " + ratio + ".");
	}
}
