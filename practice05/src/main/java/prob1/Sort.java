package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  array.length;
		System.out.println( "Before sort." );	
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		System.out.println(" ");
		System.out.println(" ");
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		for(int a=1;a<count;a++) {
			for(int i=0; i<count-1;i++) {
				if(array[i] < array[i+1]) { // 앞뒤 숫자를 비교하여 뒤 숫자가 더 크다면 앞에 숫자와 바꾸어줌 
					int p = array[i];
					array[i] = array[i+1];
					array[i+1] = p;	
				}
					for(int j = 0;j<count;j++) { 			
				}				
			}		
		}			
		// 결과 출력
		System.out.println( "\nAfter Sort." );	
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}	
	}
}
