
public class ArrayUtils {

	
	
	// int 배열을 double 배열로 변환
	static double[] intToDouble( int[] source ){
		
		double[] a = new double[source.length];
		
		
		for(int i = 0; i<source.length; i++){
			
			a[i] = source[i];
		}
		
		
		return a;
	
	}

	
	
	
	// double 배열을 int 배열로 변환
	static int [] doubleToInt( double[] source ){
		
	int[] a = new int[source.length];
		
		
		for(int i = 0; i<source.length; i++){
			
			a[i] = (int )source[i];
		}
		
		
		return a;
		
	}

	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int [] concat( int[] s1, int[] s2 ){
		
		int[] b = new int[s1.length+s2.length];
		
		for(int i = 0; i<s1.length + s2.length; i++){
			
			if(i<s1.length){

				b[i] = s1[i];
					
			}else{
				b[i] = s2[i-s1.length];
			}
			
			
		}
		
		return b;
	}

	
}
