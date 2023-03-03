package convertidor_monedas;

import java.text.DecimalFormat;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Conversor_moneda {


	double Usd = 0.055;
	double Eur = 0.052;
	double Lib = 0.046;
	double Yen = 7.50;
	double Won = 71.92;
	double conversion = 0;
	boolean isRunning=true;






	public  Conversor_moneda() {

		while(isRunning) {
			try {

				Icon icono = new ImageIcon ("iconos/conversor.png");
				Icon icono2 = new ImageIcon ("iconos/saludos.png");
				Icon icono3 = new ImageIcon ("iconos/convertir.png");
				Object monedas =JOptionPane.showInputDialog(null, "Selecciona una opción", "Conversor de Monedas.", JOptionPane.PLAIN_MESSAGE,icono, 
						new Object[] {"Peso(MXN) a Dólar(USD)","Peso(MXN) a Euro(EUR)","Peso(MXN) a Libra(LIB)","Peso(MXN) a Yen Japones(JPY)","Peso(MXN) a Won Surcoreano(KRW)"
								,"Dólar(USD) a Peso(MXN)","Euro(EUR) a Peso(MXN)","Libra(LIB) a Peso(MXN)","Yen Japones(JPY) a Peso(MXN)","Won Surcoreano(KRW) a Peso(MXN)"},null);
				String moneda =(String)monedas;
				
				if(moneda !=null) {


					double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad a convertir."));
					DecimalFormat df = new DecimalFormat("#.000");
					switch(moneda) {
					case "Peso(MXN) a Dólar(USD)":
						conversion = cantidad*Usd;
						JOptionPane.showInternalMessageDialog(null, "$ "+cantidad + " Pesos (MXN) equivalen a $ "+df.format(conversion)+" Dólares (USD) ");
						break;
					case "Peso(MXN) a Euro(EUR)":
						conversion = cantidad*Eur;
						JOptionPane.showInternalMessageDialog(null, "$ "+cantidad + " Pesos (MXN) equivalen a € "+df.format(conversion)+" Euros (EUR)");
						break;
					case "Peso(MXN) a Libra(LIB)":
						conversion = cantidad*Lib;
						JOptionPane.showInternalMessageDialog(null, "$ "+cantidad + " Pesos (MXN) equivalen a £ "+df.format(conversion)+" Libras (LIB)");
						break;
					case "Peso(MXN) a Yen Japones(JPY)":
						conversion = cantidad*Yen;
						JOptionPane.showInternalMessageDialog(null, "$ "+cantidad + " Pesos (MXN) equivalen a ¥ "+df.format(conversion)+" Yenes (JPY)");
						break;
					case "Peso(MXN) a Won Surcoreano(KRW)":
						conversion = cantidad*Won;
						JOptionPane.showInternalMessageDialog(null, "$ "+cantidad + " Pesos (MXN) equivalen a ₩ "+df.format(conversion)+" Wones (KRW)");
						break;

					case "Dólar(USD) a Peso(MXN)":
						conversion = cantidad/Usd;
						JOptionPane.showInternalMessageDialog(null, "$ "+cantidad + " Dólares (USD) equivalen a $ "+df.format(conversion)+" Pesos (MXN)");
						break;
					case "Euro(EUR) a Peso(MXN)":
						conversion = cantidad/Eur;
						JOptionPane.showInternalMessageDialog(null, "€ "+cantidad + " Euros (EUR) equivalen a $ "+df.format(conversion)+" Pesos (MXN)");
						break;
					case "Libra(LIB) a Peso(MXN)":
						conversion = cantidad/Lib;
						JOptionPane.showInternalMessageDialog(null, "£ "+cantidad + " Libras (LIB) equivalen a $ "+df.format(conversion)+" Pesos (MXN)");
						break;
					case "Yen Japones(JPY) a Peso(MXN)":
						conversion = cantidad/Yen;
						JOptionPane.showInternalMessageDialog(null, "¥ "+cantidad + " Yenes (JPY) equivalen a $ "+df.format(conversion)+" Pesos (MXN)");
						break;
					case "Won Surcoreano(KRW) a Peso(MXN)":
						conversion = cantidad/Won;
						JOptionPane.showInternalMessageDialog(null, "₩ "+cantidad + "Wones (KRW)  equivalen a $ "+df.format(conversion)+" Pesos (MXN)");
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


