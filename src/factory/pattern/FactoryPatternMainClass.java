package factory.pattern;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession("Doctor");
		doc.print();
		
	}

}
