package _03_Text_Funkifier;

public class MixedUpWord implements TextFunkifier{
	private String unfunkifiedText;
	
	public MixedUpWord(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}

	@Override
	public String funkifyText() {
		String temp = "";
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			char nc = unfunkifiedText.charAt(i);
			if (Character.toLowerCase(nc) == 'o') {
				temp = temp + 0;
			}else if (Character.toLowerCase(nc) == 's') {
				temp = temp + '$';
			}else if (Character.toLowerCase(nc) == 'a') {
				temp = temp + '@';
			}else if (Character.toLowerCase(nc) == 'x') {
				temp = temp + '*';
			}else if (Character.toLowerCase(nc) == 'i') {
				temp = temp + ';';
			}else if (Character.toLowerCase(nc) == 'h') {
				temp = temp + '#';
			}else {
				temp = temp + nc;
			}
		}
		return temp;
	}
	
	
}
