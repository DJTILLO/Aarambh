class PossibleWords{
	public String PossibleWordsCheck(String input1, String input2) {
		String msg="";
		input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		String data[] = input2.split(":");
		String chk[] = input1.split("_");
		for(int i=0;i<data.length;i++)
			if(data[i].length()==input1.length()) {
				if(data[i].startsWith(chk[0]) && data[i].endsWith(chk[1])) {
					msg=msg+":"+data[i];
				}
			}
		if(msg.length()<1)
			System.out.println("ERROR-009");
		else
			msg=msg.substring(1);
		return msg;
	}
}
public class PossibleWordsMain {

	public static void main(String[] args) {
		String input1 = "Fi_er";
		String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
		PossibleWords pw = new PossibleWords();
		System.out.println(pw.PossibleWordsCheck(input1, input2));
		
	}

}
