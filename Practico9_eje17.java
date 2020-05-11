package UDE_P9;

public class Eje17_variables {

	public static void main(String[] args) {

		/*
		 * Escriba el código en java para resolver los siguientes problemas:
		 * 
		 * 2. En un camping se alquila la parcela por 100 pesos por día por persona. Si
		 * se paga la estadía por anticipado, se obtiene un descuento fijo del 15%. Un
		 * grupo de amigos tiene 1200 pesos y desea quedarse 3 días. Se desea saber si
		 * el dinero que tienen es suficiente si pagan por anticipado. Genere
		 * automáticamente la cantidad de amigos en el grupo (entre 0 y 10) y realice
		 * los cálculos de manera que la salida sea, por ejemplo:
		 * 
		 * Les alcanza? true
		 * 
		 */

		final double _descuento = 0.15;
		double _dineroTienen = 1200;
		double _gastos = 0;
		double _total = 0;

		int grupo_amigos = (int) (Math.random() * 11);

		boolean _alcanza = false;

		System.out.println("El grupo se compone de [" + grupo_amigos + "] amigos y tienen [$" + " " + _dineroTienen
				+ "] pesos. \n");

		/*
		 * No queremos calcular innecesariamente, por lo que si el n° aleatorio es 0,
		 * finalizamos el proceso de inmediato.
		 */
		if (grupo_amigos != 0) {

			/*
			 * Calculamos el gasto sin descuentos
			 */
			_gastos = (grupo_amigos * 100) * 3;
			System.out.println("Subtotal: $ " + _gastos);

			/*
			 * Luego aplicamos el descuento de 15% sobre el subtotal
			 */
			System.out.println("\nDescuento por anticipado del 15%");
			_total = _gastos - (_gastos * _descuento);

			System.out.println("   El nuevo total es de $ " + _total);

			/*
			 * Evaluamos.
			 * 
			 * El monto total contra el dinero que poseen los amigos.
			 */
			if (_total <= _dineroTienen) {
				_alcanza = true;
				System.out.println("\nLes alcanza? " + "[" + _alcanza + "]");
				System.out.println("\nPara esa cantidad de amigos, les alcanza para los 3 días!");

			} else {
				System.out.print(
						"\nLes alcanza? " + "[" + _alcanza + "]" + " lamentablemente el dinero no es suficiente.");
			}
		} else {
			System.out.println("Alguien tocó el timbre de recepción y se fue corriendo al ver los precios..");
		}
	}
}
