package abstract_factory.pattern;

public class ProfessionAbstractFactory extends AbstractFactory{
	
	@Override
	public Profession getProfession(String typeOfProfession){
	      
		  if(typeOfProfession == null){
	         return null;
	      }		
	         
		  else if(typeOfProfession.equalsIgnoreCase("Engineer")){
	         return new Engineer();
	         
	      } else if(typeOfProfession.equalsIgnoreCase("Teacher")){
	         return new Teacher();
	      }
	      
	      return null;
	   }

}
