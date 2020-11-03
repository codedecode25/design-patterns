package factory.pattern;

public class ProfessionFactory {
	
	public Profession getProfession(String typeOfProfession){
	      if(typeOfProfession == null){
	         return null;
	      }		
	      if(typeOfProfession.equalsIgnoreCase("Doctor")){
	         return new Doctor();
	         
	      } else if(typeOfProfession.equalsIgnoreCase("Engineer")){
	         return new Engineer();
	         
	      } else if(typeOfProfession.equalsIgnoreCase("Teacher")){
	         return new Teacher();
	      }
	      
	      return null;
	   }

}
