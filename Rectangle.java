/**Набор решений задачи нахождения 
* площади прямоугольника.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Rectangle {
	/**известны две смежные стороны
	* @param a длина одной стороны
	* @param b длина второй стороны
	* @return площадь прямоугольника
	*/
	public static double stor2(double a, double b)
	{
		return a * b;
	}
	
	/**известны две диагонали (они равны) и угол между ними
	* @param diag длина одной стороны
	* @param y угол между диагоналями в градусах
	* @return площадь прямоугольника
	*/
	public static double diagonalsAng(double diag, double y)
	{
		double result = 0;
		double angle = Math.toRadians(y);
		result = 0.5 * diag * diag * Math.sin(angle);
		return result;
	}
	
	/**известны сторона и диагональ
	* @param a сторона
	* @param diag диагональ
	* @return площадь прямоугольника
	*/
	public static double storDiag(double a, double diag)
	{
		double result = 0;
		double b = Math.sqrt(diag*diag - a*a);
		result = a * b;
		return result;
	}
}
