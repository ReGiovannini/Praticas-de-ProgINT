package atividadePais;

import java.util.ArrayList;

public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	@SuppressWarnings({ "rawtypes" })
	public ArrayList getPaisMaisHab() {
		return PaisDAO.buscaPaisMaisHab();	
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getPaisMenor() {
		return PaisDAO.buscaPaisMenor();	
	}
	

}