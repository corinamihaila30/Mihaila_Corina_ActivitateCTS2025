package readers;

import seminar2.clase.Angajat;
import seminar2.clase.Aplicant;
import seminar2.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends BaseReader{

    public EleviReader(String fileName) {
        super(fileName);
    }

    public  List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();
        while (input2.hasNext()) {
            Elev elev = new Elev();
            citireAplicant(input2,elev);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
