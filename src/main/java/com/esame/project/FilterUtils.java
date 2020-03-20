package com.esame.project;

/**
 * Classe che gestisce i filtri.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class FilterUtils<T> {
    /**
     * 
     * @param src lista completa
     * @param fieldName primo campo da confrontare
     * @param operator operatore
     * @param value secondo campo da confrontare
     * @return la lista filtrata 
     */
	public Collection<T> select(Collection<T> src, String fieldName, String operator, Object value) {
		Collection<T> out = new ArrayList<T>();
		for(T item:src) {
			try {
				Method m = item.getClass().getMethod("get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1),null);
				//ottiene il metodo
				try {
					Object tmp = m.invoke(item); //invoco il metodo
					if(FilterUtils.check(tmp, operator, value)) 
						out.add(item);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return out;
	}
    /**
     * 
     * @param value primo valore da confrontare
     * @param operator operatore
     * @param th secondo valore da confrontare
     * @return true se sono uguali, maggiori o minori (a seconda dell'operazione scelta) e false se non lo sono
     */
	private static boolean check(Object value, String operator, Object th) {
		if (th instanceof Number && value instanceof Number) {	//se si stanno confrontando 2 numeri
			Double thC = ((Number)th).doubleValue();        //faccio il casting di tipo double
			Double valuec = ((Number)value).doubleValue();  //faccio il casting di tipo double
			if (operator.equals("="))				//se l'operatore è uguale
				return value.equals(th);  //ritorna vero se è maggiore sennò falso
			else if (operator.equals(">"))
				return valuec > thC;
			else if (operator.equals(">="))
					return valuec >= thC;
			else if (operator.equals("<="))
				return valuec <= thC;		
			else if (operator.equals("<"))
				return valuec < thC;
		}else if(th instanceof String && value instanceof String) //se si stanno confrontando 2 stringhe
			return value.equals(th);       //ritorna vero se sono uguali sennò falso
		return false;		//in tutti gli altri casi ritorna falso
	}
	//filtro dati
	/**
	 * 
	 * @param operator operatore scelto
	 * @param tipo tipo di struttura extra-alberghiera cercata
	 * @param camere numero di camere
	 * @param municipio numero del municipio
	 * @param map map che può valere true se si vuole stampare la lista in formato geojson, se vale false in formato json
	 * @return la lista filtrata
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public static Object filtro (String operator,String nome, Integer n_classi, Integer n_alunni) throws FileNotFoundException, IOException, ParseException
	{
		ListGenerator Lista =new ListGenerator();
		ArrayList filtroN_Classi = new ArrayList();	
		ArrayList filtroN_Alunni = new ArrayList(); 
		
			filtroN_Classi = Lista.filterField("numero di classi", "=", n_classi);  //filtro i tipi di attività
			filtroN_Alunni = Lista.filterField("numero di alunni", "=" ,n_alunni);     //filtro i numeri delle camere
			
			return Listafiltrata(nome, n_classi,n_alunni,filtroN_Alunni,filtroN_Classi );
		}
	
	/**
	 * 
	 * @param tipo tipo di struttura extra-alberghiera
	 * @param camere numero di camere
	 * @param municipio numero del municipio
	 * @param filtroTipo lista filtrata
	 * @param filtroCamere lista filtrata
	 * @return la lista filtrata
	 */
	private static List<DatasetStructure> Listafiltrata(String nome, Integer n_classi, Integer n_alunni, List filtroN_Alunni, List filtron_Classi)
	{

		//valuto caso per caso il filtro da attuare a seconda della scelta dell'utente
		
	    if(nome==null && n_classi!=null && n_alunni==null) return filtron_Classi;
		else if(nome==null && n_classi==null && n_alunni!=null) return filtroN_Alunni;
		
		return null;
	}	
	/**
	 * 
	 * @param filtro1 prima lista filtrata
	 * @param filtro2 seconda lista filtrata
	 * @return intersezione tra filtro1 e filtro2
	 */
	private static List<DatasetStructure> intersezione(List filtro1,List filtro2) //intersezione tra le liste
	{
		List Intersezione=new ArrayList(filtro1);
		Intersezione.retainAll(filtro2);
		return Intersezione;
	}

}

