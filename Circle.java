/**Набор решений задачи нахождения 
* площади круга.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Circle {

	static double PI = 3.1415926535897932384626433832795;
	/**известен радиус круга
	* @param r радиус
	* @return площадь круга
	*/
	public static double radius(double r) {
		return PI * r * r;
	}
	
	/**известна длина окружности ("периметр")
	* @param L длина окружности
	* @return площадь круга
	*/
	public static double length(double L) {
		return 0.25 * L * L / PI;
	}
	
	/**площадь сектора круга - известен радиус и угол
	* @param r радиус
	* @param y угол
	* @return площадь сектора
	*/
	public static double SectorRadisAng(double r, double y){
		double angle = Math.toRadians(y);
		return 0.5 * angle * r * r;
	}	
}