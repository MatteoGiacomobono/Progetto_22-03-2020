package com.esame.project;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.json.simple.*;

/**
 * Classe che gestisce le richieste GET.
 */
@RestController 
public class Controller {
	//stampa tutti i dati del dataset in formato json
	/**
	 * 
	 * @return lista completa
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@RequestMapping(path="/data", method = RequestMethod.GET, headers="Accept=application/json; charset=utf-8")
	public List<DatasetStructure> GetAllData() throws FileNotFoundException, IOException 
	{
		ListGenerator Lista = new ListGenerator();
		return Lista.getLista();
	}
	
	@RequestMapping(path="/delete/{id}", method= {RequestMethod.DELETE, RequestMethod.GET}, headers="Accept=application/json; charset=utf-8" )
	public List<DatasetStructure> remove(@PathVariable("id")int index) throws FileNotFoundException, IOException
	{
		ListGenerator Lista = new ListGenerator();
		List<DatasetStructure> list = Lista.getLista();
		list.remove(index);
		return list;
	}
    

	//stampa gli elementi unici e le occorrenze
	@RequestMapping(path="/data/stats", method = RequestMethod.GET, headers="Accept=application/json; charset=utf-8")
	public JSONObject Unici(@RequestParam(value="Field",required=false) String campo) throws FileNotFoundException, IOException //stampa tutti i dati del dataset in formato json
, ClassNotFoundException

	{
		Stats ElementiUnici = new Stats(campo);
		return ElementiUnici.getElementi() ;  //ritorna gli elementi unici e occorrenze
	}
	//stampa metadata in formato json
	/**
	 * 
	 * @return i metadati
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@RequestMapping(path="/metadata", method = RequestMethod.GET, headers="Accept=application/json")
	public JSONArray GetMetadata() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		MetadataGenerator metadata = new MetadataGenerator();
		return metadata.getMetadata();
	}
	//stampa dati in formato geojson
	/**
	 * 
	 * @return 
	 * @return i dati in formato geojson
	 * @throws ParseException
	 * @throws IOException
	 */
	
	
	
}
