package com.esame.project;

/**
 * @author Samuele Leli (s1084424@studenti.univpm.it)
 * @version 1.0
 */
/**
 * Classe che contiene la struttura del dataset.
 */
public class DatasetStructure {
	
	String AnnoSco;
	int CodScuo;  //x2
	String Gestione;
	String Nome;
	String Indirizzo;
	int Municipio;  //x6
	String NilScuola;
	int Capienza; //x8
	int N_classi; //x9
	int Alunni; //x10
	int Alunni_m; //x11
	int Alunni_f; //x12
	int Alunni_res; //x13
	int Alunni_nores; //x14
	int Alunni_ita; //x15
	int Alunni_ue15; //x16
	int Alunni_ue; //x17
	int Alunni_noue; //x18
	int Alunni_africa; //x19
	int Alunni_NA; //x20
	int Alunni_CSA; //x21
	int Alunni_asia; //22
	int Alunni_idk; //x23
	int Alunni_citt_ita; //x24
	int Alunni_citt_noita; //x25
	int Alunni_nocitt;  //x26
	long ID;
	
    //classe che contiene i parametri del dataset
	
	public DatasetStructure(long id, String annosco , int codScuo, String gestione, String nome, String indirizzo, int municipio, String nilScuola, 
			int capienza, int n_classi, int alunni, int alunni_m , int alunni_f , int alunni_res , int alunni_nores , int alunni_ita,
			int alunni_ue15 , int alunni_ue , int alunni_noue , int alunni_africa , int alunni_NA , int alunni_CSA , int alunni_asia,
			int alunni_idk , int alunni_citt_ita , int alunni_citt_noita , int alunni_nocitt) {
		super();
		ID=id;
		AnnoSco = annosco;
		CodScuo = codScuo;
		Gestione = gestione;
		Nome = nome;
		Indirizzo = indirizzo;
		Municipio = municipio;
		NilScuola = nilScuola;
		Capienza = capienza;
		N_classi = n_classi;
		Alunni = alunni;
		Alunni_m = alunni_m;
		Alunni_f = alunni_f;
		Alunni_res = alunni_res;
		Alunni_nores = alunni_nores;
		Alunni_ita = alunni_ita;
		Alunni_ue15 = alunni_ue15;
		Alunni_ue = alunni_ue;
		Alunni_noue = alunni_noue;
		Alunni_africa = alunni_africa;
		Alunni_NA = alunni_NA;
		Alunni_CSA = alunni_CSA;
		Alunni_asia = alunni_asia;
		Alunni_idk = alunni_idk;
		Alunni_citt_ita = alunni_citt_ita;
		Alunni_citt_noita = alunni_citt_noita;
		Alunni_nocitt = alunni_nocitt;
		}

	// getter / setter //
	public Long getID() {
		return ID;
	}

	public void setID(Long id) {
		ID = id;
	}
	
	
	public String getAnnoSco() {
		return AnnoSco;
	}

	public void setAnnoSco(String annoSco) {
		AnnoSco = annoSco;
	}

	public int getCodScuo() {
		return CodScuo;
	}

	public void setCodScuo(int codScuo) {
		CodScuo = codScuo;
	}

	public String getGestione() {
		return Gestione;
	}

	public void setGestione(String gestione) {
		Gestione = gestione;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	public int getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(int municipio) {
		Municipio = municipio;
	}

	public String getNilScuola() {
		return NilScuola;
	}

	public void setNilScuola(String nilScuola) {
		NilScuola = nilScuola;
	}

	public int getCapienza() {
		return Capienza;
	}

	public void setCapienza(int capienza) {
		Capienza = capienza;
	}

	public int getN_classi() {
		return N_classi;
	}

	public void setN_classi(int n_classi) {
		N_classi = n_classi;
	}

	public int getAlunni() {
		return Alunni;
	}

	public void setAlunni(int alunni) {
		Alunni = alunni;
	}

	public int getAlunni_m() {
		return Alunni_m;
	}

	public void setAlunni_m(int alunni_m) {
		Alunni_m = alunni_m;
	}

	public int getAlunni_f() {
		return Alunni_f;
	}

	public void setAlunni_f(int alunni_f) {
		Alunni_f = alunni_f;
	}

	public int getAlunni_res() {
		return Alunni_res;
	}

	public void setAlunni_res(int alunni_res) {
		Alunni_res = alunni_res;
	}

	public int getAlunni_nores() {
		return Alunni_nores;
	}

	public void setAlunni_nores(int alunni_nores) {
		Alunni_nores = alunni_nores;
	}

	public int getAlunni_ita() {
		return Alunni_ita;
	}

	public void setAlunni_ita(int alunni_ita) {
		Alunni_ita = alunni_ita;
	}

	public int getAlunni_ue15() {
		return Alunni_ue15;
	}

	public void setAlunni_ue15(int alunni_ue15) {
		Alunni_ue15 = alunni_ue15;
	}

	public int getAlunni_ue() {
		return Alunni_ue;
	}

	public void setAlunni_ue(int alunni_ue) {
		Alunni_ue = alunni_ue;
	}

	public int getAlunni_noue() {
		return Alunni_noue;
	}

	public void setAlunni_noue(int alunni_noue) {
		Alunni_noue = alunni_noue;
	}

	public int getAlunni_africa() {
		return Alunni_africa;
	}

	public void setAlunni_africa(int alunni_africa) {
		Alunni_africa = alunni_africa;
	}

	public int getAlunni_NA() {
		return Alunni_NA;
	}

	public void setAlunni_NA(int alunni_NA) {
		Alunni_NA = alunni_NA;
	}

	public int getAlunni_CSA() {
		return Alunni_CSA;
	}

	public void setAlunni_CSA(int alunni_CSA) {
		Alunni_CSA = alunni_CSA;
	}

	public int getAlunni_asia() {
		return Alunni_asia;
	}

	public void setAlunni_asia(int alunni_asia) {
		Alunni_asia = alunni_asia;
	}

	public int getAlunni_idk() {
		return Alunni_idk;
	}

	public void setAlunni_idk(int alunni_idk) {
		Alunni_idk = alunni_idk;
	}

	public int getAlunni_citt_ita() {
		return Alunni_citt_ita;
	}

	public void setAlunni_citt_ita(int alunni_citt_ita) {
		Alunni_citt_ita = alunni_citt_ita;
	}

	public int getAlunni_citt_noita() {
		return Alunni_citt_noita;
	}

	public void setAlunni_citt_noita(int alunni_citt_noita) {
		Alunni_citt_noita = alunni_citt_noita;
	}
	public int getAlunni_nocitt() {
		return Alunni_nocitt;
	}
	public void setAlunni_nocitt(int alunni_nocitt) {
		Alunni_nocitt = alunni_nocitt;
	}
	
	}
