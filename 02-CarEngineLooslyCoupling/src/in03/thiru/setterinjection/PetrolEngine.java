package in03.thiru.setterinjection;

public class PetrolEngine implements Engine{

	@Override
	public int start() {
		System.out.println("started PetrolEngine");
		
		return 1;
	}

}
