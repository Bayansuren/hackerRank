package hackerRanks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class problem4 {

	static String whatHour(int h){
		if(h == 1){
			return "one";
		}
		else if (h == 2){
			return "two";
		}
		else if (h == 3){
			return "three";
		}
		else if (h == 4){
			return "four";
		}
		else if (h == 5){
			return "five";
		}
		else if (h == 6){
			return "six";
		}
		else if (h == 7){
			return "seven";
		}
		else if (h == 8){
			return "eight";
		}
		else if (h == 9){
			return "nine";
		}
		else if (h == 10){
			return "ten";
		}
		else if (h == 11){
			return "eleven";
		}
		else if (h == 12){
			return "twelve";
		}
		return null;
	}
	
	static String whatMinutes(int m){
		int tempM = m / 10;
		int tempF = m % 10;
		if(0 <= tempM && tempM <= 1){
			return whatMinute(m);
		}
		else if(2 == tempM){
			return "twenty " + whatMinute(tempF);
		}
		else if(3 == tempM){
			return "thirty " + whatMinute(tempF);
		}
		else if(4 == tempM){
			return "fourty " + whatMinute(tempF);
		}
		else if(5 == tempM){
			return "fifty " + whatMinute(tempF);
		}
		return "";
	}
	
	static String whatMinute(int m){
		if(m == 1){
			return "one ";
		}
		else if (m == 2){
			return "two ";
		}
		else if (m == 3){
			return "three ";
		}
		else if (m == 4){
			return "four ";
		}
		else if (m == 5){
			return "five ";
		}
		else if (m == 6){
			return "six ";
		}
		else if (m == 7){
			return "seven ";
		}
		else if (m == 8){
			return "eight ";
		}
		else if (m == 9){
			return "nine ";
		}
		else if (m == 10){
			return "ten ";
		}
		else if (m == 11){
			return "eleven ";
		}
		else if (m == 12){
			return "twelve ";
		}
		else if (m == 13){
			return "thirteen ";
		}
		else if (m == 14){
			return "fourteen ";
		}
		else if (m == 15){
			return "fifteen ";
		}
		else if (m == 16){
			return "sixteen ";
		}
		else if (m == 17){
			return "seventeen ";
		}
		else if (m == 18){
			return "eighteen ";
		}
		else if (m == 19){
			return "nineteen ";
		}
		return "";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H;
		H = in.nextInt();
		int M;
		M = in.nextInt();
		String past = null;
		String to = null;
		if((1 <= H && H <= 12) && (0 <= M && M < 60)){
			if(M == 0){
				System.out.println(whatHour(H) + " o' clock");
			}
			else if(M == 15){
				System.out.println("quarter past " + whatHour(H));
			}
			else if(M == 30){
				System.out.println("half past " + whatHour(H));
			}
			else if(M == 1){
				System.out.println(whatMinutes(M) + "minute past " + whatHour(H));
			}
			else if(M <= 30){
				if(M < 10){
					System.out.println(whatMinutes(M) + "minutes past " + whatHour(H));
				}
				else
					System.out.println(whatMinutes(M) + "minutes past " + whatHour(H));
			}
			else if(M == 45){
				System.out.println("quarter to " + whatHour(H + 1));
			}
			else if(30 < M && M < 60){
				int temp = 60 - M;
				System.out.println(whatMinutes(temp) + "minutes to " + whatHour(H + 1));
			}
		}

	}

}
