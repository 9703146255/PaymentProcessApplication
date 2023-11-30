package in02.thiru.constructorinjection;

public class PetrolEngine implements Engine{

	@Override
	public int start() {
		System.out.println("started PetrolEngine");
		return 1;
	}

}
