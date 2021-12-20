package application;

public class App {

	public static void main(String[] args) {
		
		int count = 0;
		
		//the break will break out of the infinite loop
		while(true) {
			System.out.println("Hello. " + count);
			
			if(count == 5) {
				break;
			}
			System.out.println("How are you?");
			count++;
		}
		System.out.println("Program finished.");

	}

}
