import java.util.List; 

public class UtilFunctions {
	
	public static int Sum(int x, int y)
	{
		if(x<0 || x>100)
			throw new IllegalArgumentException();
		if(y<0 || y>100)
			throw new IllegalArgumentException();
		return x+y;
	}
	
	public static int ArrayProduct(List<Integer> numbers) {
		int result = 1;
		for(int x : numbers) {
			result *= x;
		}
		return result;
	}
}
