package janken;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AskTactics implements Tactics {

	public int readTactics() {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int hand = 0;
			System.out.println("?");
			
			while(true) {
				try {
					String inputStr = br.readLine();
					hand = Integer.parseInt(inputStr);
					
					if(hand < 3) {
						return hand;
					}else {
						System.out.println("?");
					}
				}catch (Exception e){
					System.out.println("?");
				}
			}
	}

}
