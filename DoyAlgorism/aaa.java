package DoyAlgorism;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int n=5;
		
		int div = 1000000007;
		int a=1;
		int b=1;
		int total=0;
		for (int i = 0; i < n-1; i++) {
			total=(a+b)%div;
			a=b;
			b=total;
		}
		System.out.println(total);
		
//	    return answer;

	}

}

/*https://programmers.co.kr/learn/courses/30/lessons/12900
 *타일링 lv3 
 * 
 */
