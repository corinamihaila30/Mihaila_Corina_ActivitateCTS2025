package seminar2.clase;

import readers.AngajatiReader;
import readers.BaseReader;
import readers.*;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> lista;
		BaseReader reader = new AngajatiReader("angajati.txt");
		try {
			lista = reader.readAplicanti();
			for(Aplicant a:lista)
				System.out.println(a.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
