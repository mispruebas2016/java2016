
public class Ejecutable {

	public static void main(String[] args) {
	Persona p1 = new Persona("Juan"); // seteo el nombre en el constructor
	p1.nombre = "Jose"; //cambio el nombre despues
//	p1.nombre="Juan";
//	p1.apellido="Perez";
	System.out.println(p1.nombre+" "+p1.apellido);
	
	}

}
