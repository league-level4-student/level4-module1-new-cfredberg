package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			if (i % 2 == 0) {
				str = str + Character.toLowerCase(unfunkifiedText.charAt(i));
			}else {
				str = str + Character.toUpperCase(unfunkifiedText.charAt(i));
			}
		}
		return str;
	}

}
