/**Набор решений задачи нахождения 
* площади параллелограмма.
* @author Alexey Gorovoy
* @author alexey.gorovoy.work@gmail.com
*/
public class Parallelogram {
	/**известны две смежные стороны и угол между ними
	* @param a длина одной стороны
	* @param b длина второй стороны
	* @param y угол между сторонами
	* @return площадь параллелограмма
	*/
	public static double stor2ang1(double a, double b, double y) {
		double angle = Math.toRadians(y);
		return a * b * Math.sin(angle);
	}
	
	/**известны сторона и высота, проведенная к этой стороне
	* @param a сторона
	* @param h высота
	* @return площадь параллелограмма
	*/
	public static double storHeight(double a, double h) {
		return a * h;
	}
	
	/**известны диагонали и угол между ними
	* @param diag1 одна диагональ
	* @param diag2 вторая диагональ
	* @param y угол между диагоналями
	* @return площадь параллелограмма
	*/
	public static double diagonalsAng(double diag1, double diag2, double y) {
		double angle = Math.toRadians(y);
		return 0.5 * diag1 * diag2 * Math.sin(angle);
	}
}