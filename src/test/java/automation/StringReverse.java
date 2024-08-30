package automation;

public class StringReverse {
	
	
	public static String reverseStr(String input) {
		
		char[] ch=input.toCharArray();
		
		StringBuilder revStr=new StringBuilder();
		
		for(int i=ch.length-1;i>0;i--) {
			
			revStr.append(ch[i]);
		
	} return revStr.toString();
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orignalStr="this is madhu";
		
		//StringReverse rev= new StringReverse();
		
		//System.out.println(rev.reverseStr(orignalStr));
		
		//reverseStr(orignalStr);
		
		System.out.println(StringReverse.reverseStr(orignalStr));
		
		
		}
	

}
