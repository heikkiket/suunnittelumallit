package _01_factorymethod;

public class Main {

    public static void main(String[] args) {
	    AterioivaOtus[] otukset = {new Opettaja(), new Oppilas(), new ToimitusJohtajaRehtori()};

	    for(AterioivaOtus otus : otukset) {
		    otus.aterioi();
	    }
    }
}
