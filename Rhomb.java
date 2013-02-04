/**Набор решений задачи нахождения 
* площади ромба.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Rhomb {
	/**известны обе диагонали
	* @param d1 длина одной диагонали
	* @param d2 длина второй диагонали
	* @return площадь ромба
	*/
	public static double diagonals(double d1, double d2)
	{
		return d1*d2/2;
	}
	
	/**известна сторона и высота
	* @param a сторона
	* @param h высота
	* @return площадь ромба
	*/
	public static double storHeight(double a, double h)
	{
		return a*h;
	}
	
	/**известна сторона и угол
	* @param a сторона
	* @param y угол
	* @return площадь ромба
	*/
	public static double storAng(double a, double y)
	{
		double angle = Math.toRadians(y);
		return a * a * Math.sin(angle);
	}
}