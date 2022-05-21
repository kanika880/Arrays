
public class InheritanceMain {
	public static void main(String[] args) {
		Building building = new Building();
		building.setName("IT");
		building.setAddress("Delhi");

    Office office = new Office();
    office.setName("wipro");
    office.setType("MNC");
    office.setCompany("Computer");
    office.setAddress("INDIA");
    System.out.println(office.getName());
    System.out.println(office.getType());
    System.out.println(office.getCompany());
    System.out.println(office.getAddress());
	}    
		
	}


