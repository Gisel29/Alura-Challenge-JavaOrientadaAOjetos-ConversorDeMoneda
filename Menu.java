//package convertidor;

import javax.swing.JOptionPane;

public class Menu {
	
	public static void main(String[] args) {
	
		
		ConversorMoneda cm = new ConversorMoneda();
		ConversorUnidadesMedidas cu = new ConversorUnidadesMedidas();
		
		while(true) {
			
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione el metodo de coversion", "Menú",
				     JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda", "Conversor Unidades de Medidas"},          	
				     "Selecciona")).toString();
			
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: "); 
				if(cm.ValidarNumero(input) == true) {
					double MonedaInput = Double.parseDouble(input);
					double total = cm.ConversionMoneda(MonedaInput);
					JOptionPane.showMessageDialog(null, "Tienes $ " + Math.round(total * 100) / 100d);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Terminado");
						break;
					}
				}
			}
            else if(opciones == "Conversor Unidades de Medidas") {
				String input = JOptionPane.showInputDialog("Ingresa la medida que deseas convertir: ");
				if(cu.ValidarNumero(input) == true) {
					double MedidaInput = Double.parseDouble(input);
					double total = cu.ConversorUnidades(MedidaInput);
					JOptionPane.showMessageDialog(null, "Tienes " + Math.round(total) );
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Terminado");
						break;
					}
				}
			}
			 
		}
		
		
	}
	
}