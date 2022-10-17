//package convertidor;

import javax.swing.JOptionPane;

public class ConversorUnidadesMedidas extends Menu {

	public boolean ValidarNumero(String input) {
		if ( input.matches("^[0-9]+([.][0-9]+)?$") ){
			return true;
		}else{
			JOptionPane.showMessageDialog(null, "Ingresa solo valor numerico.");
			return false;
		} 
	}
	
	
	public double ConversorUnidades(double MedidaInput) {
		String tipoConversion = ( JOptionPane.showInputDialog(null, "Elija la escala a la que desea convertir su temperatura","Temperaturas", 
		JOptionPane.PLAIN_MESSAGE, null, new Object[] {
			"De Kilometro  a Metro",
			"De Hectometro a Metro",
			"De Decametro a Celcius",
			"De Metro a Decimetro",
			"De Metro a Centimetro",
			"De Metro a Milimetro",
		},"De  Kilometro  a Metro")).toString();
		
		
		switch (tipoConversion) {
		
		case "De Kilometro  a Metro":
			MedidaInput = (MedidaInput * 1000) / 1 ;
			break;
			
		case "De Hectometro a Metro":
		    MedidaInput = (MedidaInput * 100) / 1 ;
			break;
			
		case "De Decametro a Metro":
		    MedidaInput = (MedidaInput * 10) / 1 ;
			break;
			
		case "De Metro a Decimetro":
		    MedidaInput = (MedidaInput * 1) / 0.1 ;
			break;
			
		case "De Metro a Centimetro":
		MedidaInput = (MedidaInput * 1) / 0.01 ;
			break;
			
		case "De Metro a Milimetro":
		MedidaInput = (MedidaInput * 1) / 0.001 ;
			break;

		default:
			break;
		}
		return MedidaInput;
	}
}