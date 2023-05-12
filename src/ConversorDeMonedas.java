

import javax.swing.JOptionPane;

public class ConversorDeMonedas {
	public static void main(String[] args) {
		boolean bandera = true;
		while(bandera) {
			String[] TipoConversor = {"Conversor de Monedas", "Conversor de Temperatura"};
			
			String SeleccionarConversor = 
					(String)JOptionPane.showInputDialog
					(null,"Elija el tipo de conversor:"
							+ " ","Cuadro de Dialogo de Entrada", JOptionPane.PLAIN_MESSAGE, null, TipoConversor,TipoConversor[0]);
			
			if (SeleccionarConversor == "Conversor de Monedas") {
				
				String[] conversiones = {"Peso a Dolar", "Peso a Euro", "Peso a Libras Esterlinas","Peso a Yen Japones", "Peso a Won sul-coreano", "Dolar a Peso", "Euro a Peso", "Libra Esterlina a Peso", "Yen Japones a Peso", "Won sul-coreano a Peso "};
				String tipoConversion = (String)JOptionPane.showInputDialog (null,"Elija el tipo de conversor:"
						+ " ","Cuadro de Dialogo de Entrada", JOptionPane.PLAIN_MESSAGE, null, conversiones,conversiones[0]);
				if (tipoConversion != null) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor: "));
					double resultado;
					
					switch (tipoConversion) {
				    	case "Peso a Dolar":
				    		resultado = valor * 0.056;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Peso a Euro":
				    		resultado = valor * 0.051;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Peso a Libras Esterlinas":
				    		resultado = valor * 0.045;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Peso a Yen Japones":
				    		resultado = valor * 7.59;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Peso a Won sul-coreano":
				    		resultado = valor * 74.27;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Dolar a Peso":
				    		resultado = valor * 17.80;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Euro a Peso":
				    		resultado = valor * 19.58;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Libra Esterlina a Peso":
				    		resultado = valor * 22.46;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Yen Japones a Peso":
				    		resultado = valor * 0.13;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				    	case "Won sul-coreano a Peso ":
				    		resultado = valor * 0.013;
				    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
				    		break;
				   
				    	default:
				    		JOptionPane.showMessageDialog(null, "Error");
				    		break;
					}
				
					
					String[] opciones = {"Si", "No"};
					int seleccion = JOptionPane.showOptionDialog(null, "¿Desea hacer otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
					
					if (seleccion == 0) {
						bandera = true;
					}
					else {
						JOptionPane.showMessageDialog(null, "GRACIAS POR USAR EL CONVERSOR DE MONEDAS 3000");
						break;
						
					}
					
				}
				
				else {
					break;
				}
			
				
						
			}
			else if(SeleccionarConversor == "Conversor de Temperatura"){
				String[] Conversiones = {"Celsius a Fahrenheit","Celsius a Kelvin","Fahrenheit a Kelvin","Fahrenheit a Celsius","Kelvin a Celsius","Kelvin a Fahrenheit"};
				String tipoConversion = (String)JOptionPane.showInputDialog (null,"Elija el tipo de conversor:"
						+ " ","Cuadro de Dialogo de Entrada", JOptionPane.PLAIN_MESSAGE, null, Conversiones,Conversiones[0]);
				
				if(tipoConversion != null) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor: "));
					double resultado;
					switch (tipoConversion) {
			    	case "Celsius a Fahrenheit":
			    		resultado = ((valor * 9)/5) + 32;
			    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
			    		break;
			    	case "Celsius a Kelvin":
			    		resultado = valor + 273.15;
			    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
			    		break;
			    	case "Fahrenheit a Kelvin":
			    		resultado = (((valor - 32) * 5)/9) + 273.15;
			    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
			    		break;
			    	case "Fahrenheit a Celsius":
			    		resultado = ((valor -32)*5)/9;
			    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
			    		break;
			    	case "Kelvin a Celsius":
			    		resultado = valor - 273.15;
			    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
			    		break;
			    	case "Kelvin a Fahrenheit":
			    		resultado = ((valor - 273.15)*1.8)+32;
			    		JOptionPane.showMessageDialog(null, "El valor es: " + resultado);
			    		break;
			   
			    	default:
			    		JOptionPane.showMessageDialog(null, "Error");
			    		break;
				}
					
					
				
				}
				else {
					break;
				}
				}
				
			
			else {
				JOptionPane.showMessageDialog(null, "Usted ha salido del programa", "Salir", JOptionPane.INFORMATION_MESSAGE);
				break;

			}
		}
			
			
		}
		

}
