package bits;

public class Bits {

	public static void main(String[] args) {
		
		
		int numero = 255;
		int temp;
		int binario[] = new int[32];
		int b = 32;
		int x = 1;
		
		temp = numero;
		
		while(temp > 0) {
			
			binario[b-x] = temp%2;
			temp = temp/2;
			x++;
		}
				
		for(int i = 0; i < 32;i++) {
			
			System.out.print(binario[i]);
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
