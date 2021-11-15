package facade;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class BusquedaFacade {

	private SlafiAPI slafiAPI;
	
	public BusquedaFacade() {
		
		slafiAPI = new SlafiAPI();
	}
	
	public ArrayList<Post> buscar( String api ) {
		
		switch(api) 
		{
			case "Slafi":
				slafiAPI.buscarAPI( api );
				break;
			default:
				System.out.println("API No Encontrada");								
		}	
				
		return slafiAPI.model;
		
		
	}	
	
}
