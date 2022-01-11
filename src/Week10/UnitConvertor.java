package Week10;

/**
 * Converts various units
 * 
 * @author neilr
 */
public class UnitConvertor {
	/**
	 * Converts from cm to inches
	 * 
	 * @param cms
	 * @return the cm converted as inches
	 */
	public double cmToInches(double cm) {
		return cm * 0.39370078740157;
	}

	/**
	 * Converts from inches to cm
	 * 
	 * @param
	 * @return the inch converted as cms
	 */
	public double inchesToCm(double inch) {
		return inch * 2.54;
	}

	/**
	 * Converts from mile to km
	 * 
	 * @param
	 * @return the mile converted as KMs
	 */
	public double milesToKm(double mile) {
		return mile * 1.609344;
	}

	/**
	 * Converts from km to mile
	 * 
	 * @param
	 * @return the kms converted as miles
	 */
	public double KMToMile(double km) {
		return km * 0.621371192;
	}
}
