package convertidor_monedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Conversor_masa {
	
	double miligramo = 1000;
	double gramo = 1;
	double kilogramo = 1000;
	double hectogramo = 0.01;
	double decagramo = 10;
	double centigramo = 100;
	double tonelada = 1000000;
	double conversion =0;
	
	boolean isRunning=true;



	public  Conversor_masa() {

		while(isRunning) {
			try {
				
				
				Icon icono = new ImageIcon ("iconos/masalogo.jpg");
				Icon icono2 = new ImageIcon ("iconos/saludos.png");
				Object monedas =JOptionPane.showInputDialog(null, "Selecciona una opción", "Conversor de Unidades de Masa.", JOptionPane.PLAIN_MESSAGE,icono, 
						new Object[] {"Gramo (g) a Miligramo(mg)","Gramo (g) a Centigramo (cg)","Gramo (g) a Decagramo(dag)","Gramo (g) a Hectogramo (hg)",
								"Gramo (g) a Kilogramo (kg)","Gramo (g) a Tonelada (t)"},null);
				String moneda =(String)monedas;
				
				if(moneda !=null) {


					double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a convertir."));
					DecimalFormat df = new DecimalFormat("0.000");
					switch(moneda) {
					case "Gramo (g) a Miligramo(mg)":
						conversion = cantidad*miligramo;
						JOptionPane.showInternalMessageDialog(null, cantidad + " gramos (g) es quivalente a "+df.format(conversion)+" miligramos (mg)");
						break;
					case "Gramo (g) a Centigramo (cg)":
						conversion = cantidad*centigramo;
						JOptionPane.showInternalMessageDialog(null, cantidad + " gramos (g) es quivalente a "+df.format(conversion)+" centigramos (cg)");
						break;
					case "Gramo (g) a Decagramo(dag)":
						conversion = cantidad/decagramo;
						JOptionPane.showInternalMessageDialog(null, cantidad + " gramos (g) es quivalente a "+df.format(conversion)+" decagramos (dag)");
						break;
					case "Gramo (g) a Hectogramo (hg)":
						conversion = cantidad*hectogramo;
						JOptionPane.showInternalMessageDialog(null, cantidad + " gramos (g) es quivalente a "+df.format(conversion)+" hectogramos (hg)");
						break;
					case "Gramo (g) a Kilogramo (kg)":
						conversion = cantidad/kilogramo;
						JOptionPane.showInternalMessageDialog(null, cantidad + " gramos (g) es quivalente a "+df.format(conversion)+" kilogramos (kg)");
						break;

					case "Gramo (g) a Tonelada (t)":
						conversion = cantidad/tonelada;
						JOptionPane.showInternalMessageDialog(null, cantidad + " gramos (g) es quivalente a "+conversion+" toneladas (t)");
						break;
					
		



					}
				}else {
					JOptionPane.showInternalMessageDialog(null, "Hasta luego.", null, JOptionPane.PLAIN_MESSAGE,icono2);
					System.exit(0);
				}
			}catch(NumberFormatException | NullPointerException f){
				JOptionPane.showMessageDialog(null, "Error, Por favor ingrese valor numérico valido.",
					      "Error", JOptionPane.ERROR_MESSAGE);
			}

		}


	}

}
