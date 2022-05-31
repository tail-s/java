package example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {

		SamsungPhone sam = new SamsungPhone();
		sam.setCompany("ªÔº∫");
		sam.setModel("∞∂∑∞Ω√8");
		sam.setRelease(2018);
		sam.setColor("∞À¡§");
		
		System.out.println(sam.toString());
		
		SamsungPhone sam1 = new SamsungPhone();
		
		sam1.setCompany("LG");
		sam1.setModel("G6");
		sam1.setRelease(2017);
		sam1.setColor("ª°∞≠");
		
		System.out.println(sam1.toString());

	}

}
