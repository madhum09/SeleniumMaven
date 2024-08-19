package automation;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	
	public static void main(String args[]) {
		
		String str= "I'm Lord Venkatesha Govinda Govindha Govinda";
		
		String[] words=str.split("\\s+");
		
		
		Map<String,Integer> wordMap= new HashMap<String,Integer>();
		
		for(String wd:words) {
			
			wordMap.put(wd,wordMap.getOrDefault(wd, 0)+1);
			
		}
		
		for(Map.Entry<String, Integer> entryS:wordMap.entrySet()) {
			System.out.println(" "+ entryS.getKey()+" "+ entryS.getValue());
		}

	}

}
