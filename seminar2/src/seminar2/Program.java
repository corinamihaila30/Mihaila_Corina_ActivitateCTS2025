package seminar2;

import seminar2.models.Aplicant;
import seminar2.readers.AngajatiReader;
import seminar2.readers.BaseReader;

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
