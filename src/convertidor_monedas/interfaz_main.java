package convertidor_monedas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class interfaz_main {
	
	public static void main(String[] args) {
		
		Icon icono = new ImageIcon ("iconos/logoalura.png");
		Icon icono2 = new ImageIcon ("iconos/saludos.png");
		
		Object [] menu_principal = {"Convertidor de Moneda","Convertidor de Masa"};
		Object opciones =JOptionPane.showInputDialog(null, "Selecciona una opción", "Convertidor de Monedas y unidades de Masa", JOptionPane.QUESTION_MESSAGE,icono,menu_principal, menu_principal[0] );
		String opcion =(String)opciones;
		
		
			
			try {
				switch(opcion) {
			
			case "Convertidor de Moneda":
				
				new Conversor_moneda();
	
				break;
			case "Convertidor de Masa":
				
				new Conversor_masa();
				
				break;
				
				}
			}catch(NullPointerException n){
				JOptionPane.showInternalMessageDialog(null, "Hasta luego.", null, JOptionPane.PLAIN_MESSAGE,icono2);
			}
		
		
		
	}
}
