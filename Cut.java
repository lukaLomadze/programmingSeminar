
import acm.program.ConsoleProgram;

public class Cut extends ConsoleProgram{
	public void run() {
		String text = readLine("Enter the text to count statistics: ");
		printCharStatistics(text);
	}
	
	private void printCharStatistics(String text) {
		for(int i = 0; i < text.length(); i++) {
			char currCh = text.charAt(i);
			if(isFirstOccurence(text, i)) {
				int count = countSymbol(text, currCh);
				println(currCh + ": " + count);
			}
		}	
	}

//	mariami index = 4
	private boolean isFirstOccurence(String text, int index) {
		char ch = text.charAt(index); // 'a'
		int firstIndex = text.indexOf(ch); // 1
		return firstIndex == index;
	}
	
//	mariami 'a'
//	private boolean isFirstOccurence(String text, int index) {
//		for(int i = 0; i < index; i++) {
//			if(text.charAt(i) == text.charAt(index)) {
//				return false;
//			}
//		}
//		return true;
//	}

	private int countSymbol(String text, char symbol) {
		int symbolCount = 0;
		for(int  i = 0; i < text.length(); i++) {
			if(text.charAt(i) == symbol) {
				symbolCount++; // symbolCount = symbolCount + 1;
			}
		}
		return symbolCount;
	}
}

















//import acm.program.ConsoleProgram;
//
//public class Cut extends ConsoleProgram {
//public void run(){
//	
//	String txt = "vakogioluka";
//	
//	for (int i = 0; i<txt.length(); i++){
//		
//		String rep = "" + txt.charAt(i);
//		for (int k = 0; k<txt.length(); k++){
//		if(rep.equals(txt.charAt(k)+"")){
//			
//			
//		}
//			
//		}
//	}
//	
//	
//}
//	
//	
//	
//}
