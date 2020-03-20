package com.esame.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.esame.project.DatasetStructure;

/**
 * Classe che crea la lista dal dataset.
 */
public class ListGenerator
{ 
	private static final String COMMA_DELIMITER = ";";
	@SuppressWarnings({"rawtypes", "unchecked"})
	List<DatasetStructure> lista =new ArrayList();
   /**
    * 
    * @throws FileNotFoundException
    * @throws IOException
    */
	public ListGenerator() throws FileNotFoundException, IOException
	{
		super();
		BufferedReader br = new BufferedReader(new FileReader("dataset.csv"));
		String line;
		line = br.readLine();   //salvo la prima riga dei titoli in modo che non crei collisioni dopo
		long ID =0;
		while ((line = br.readLine()) != null) //legge ogni riga fino a quando non Ã¨ arrivato alla fine del file 
		{ 
			String[] valori=line.split(COMMA_DELIMITER,26);
			if(valori[5].isEmpty()) valori[5]="0";
			if(valori[7].isEmpty()) valori[7]="0";
			if(valori[8].isEmpty()) valori[8]="0";
			if(valori[9].isEmpty()) valori[9]="0";
			if(valori[10].isEmpty()) valori[10]="0";
			if(valori[11].isEmpty()) valori[11]="0";
			if(valori[12].isEmpty()) valori[12]="0";
			if(valori[13].isEmpty()) valori[13]="0";
			if(valori[14].isEmpty()) valori[14]="0";
			if(valori[15].isEmpty()) valori[15]="0";
			if(valori[16].isEmpty()) valori[16]="0";
			if(valori[17].isEmpty()) valori[17]="0";
			if(valori[18].isEmpty()) valori[18]="0";
			if(valori[19].isEmpty()) valori[19]="0";
			if(valori[20].isEmpty()) valori[20]="0";
			if(valori[21].isEmpty()) valori[21]="0";
			if(valori[22].isEmpty()) valori[22]="0";
			if(valori[23].isEmpty()) valori[23]="0";
			if(valori[24].isEmpty()) valori[24]="0";
			if(valori[25].isEmpty()) valori[25]="0";
			
			
			
			
			//fine controlli sui valori double e int in modo che non contengano il valore null

			lista.add(new DatasetStructure (ID,valori[0],Integer.parseInt(valori[1]),valori[2],valori[3],valori[4],Integer.parseInt(valori[5]),valori[6],Integer.parseInt(valori[7]),Integer.parseInt(valori[8]),Integer.parseInt(valori[9]),Integer.parseInt(valori[10]),Integer.parseInt(valori[11]),Integer.parseInt(valori[12]),Integer.parseInt(valori[13]),Integer.parseInt(valori[14]),Integer.parseInt(valori[15]),Integer.parseInt(valori[16]),Integer.parseInt(valori[17]),Integer.parseInt(valori[18]),Integer.parseInt(valori[19]),Integer.parseInt(valori[20]),Integer.parseInt(valori[21]),Integer.parseInt(valori[22]),Integer.parseInt(valori[23]),Integer.parseInt(valori[24]),Integer.parseInt(valori[25])));
			//aggiunge i valori letti a una lista
			ID=ID+1;
		}
	}
	List<DatasetStructure> getLista() {
		return lista;
	}
	void setLista(List<DatasetStructure> lista) {
		this.lista = lista;
	}
	public ArrayList filterField(String string, String string2, Integer n_classi) {
		// TODO Auto-generated method stub
		return null;
	}
}

