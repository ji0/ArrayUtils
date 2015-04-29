
public class ArrayUtilsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] intArray = {10, 20, 30,40 , 50};
		double[] doubleArray = ArrayUtils.intToDouble(intArray);
		
		for(int i = 0; i<doubleArray.length; i++){
			System.out.println(doubleArray[i]);
		}
		
		System.out.println("------");
		
		
		double[] doubleArray2= {10.0, 20.2, 300.5 ,40.1 , 50.5};
		
		int[] intArray2 = ArrayUtils.doubleToInt(doubleArray2);
		
		for(int i = 0; i<intArray2.length; i++){
			System.out.println(intArray2[i]);
		}
		
		System.out.println("------");
		int[] intArray3 = ArrayUtils.concat(intArray, intArray2);
		
		
		for(int i = 0; i<intArray3.length; i++){
			System.out.println(intArray3[i]);
		}
		
		
	}

}
