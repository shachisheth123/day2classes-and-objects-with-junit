package main;

public class Country {

	private String countryName;
	private long area;
	private long population;

	public Country() {

	}

	public Country(String countryName, long area, long population) {
		super();
		this.countryName = countryName;
		this.area = area;
		this.population = population;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public Country largestCountryArea(Country country[]) {

		int index = 0;
		long maxArea = country[0].area;
		for (int i = 1; i < country.length; i++) {
			if (maxArea < country[i].area) {
				maxArea = country[i].area;
				index = i;

			}
		}
		return country[index];
	}

	public Country largestCountryPopulation(Country country[]) {

		int index = 0;
		long maxArea = country[0].population;
		for (int i = 1; i < country.length; i++) {
			if (maxArea < country[i].population) {
				maxArea = country[i].population;
				index = i;

			}
		}
		return country[index];
	}

	public Country largestPopulationDensity(Country country[]) {

		double arr[] = new double[3];
		double populationDensity;
		for (int i = 1; i < country.length; i++) {

			populationDensity = country[i].population / country[i].area;
			arr[i] = populationDensity;
		}

		int index = 0;
		double maxPopulationDensity = arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (maxPopulationDensity < arr[j]) {
				maxPopulationDensity = arr[j];
				index = j;

			}
		}
		return country[index];

	}

}
