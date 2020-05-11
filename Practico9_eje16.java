package UDE_P9;

public class Eje16_variables {

	public static void main(String[] args) {

		/*
		 * Escriba el código en java para resolver los siguientes problemas: 
		 * 
		 * 1. En una escuela la maestra reparte entre 3 niños números para un sorteo.
		 * Los números son del 0 al 10. Los 3 niños, una vez que los reciben, se los
		 * cambian, el primero le da el suyo al segundo, éste al tercero y el tercero al
		 * primero. Se desea desplegar en consola el número que les tocó al principio a
		 * cada uno y el número que tienen al final. Genere los números aleatoriamente.
		 * 
		 */

		/*
		 * Se reparten números aleatorios entre Javier, Tamara y Lucía
		 * 
		 */
		int nro_Javier = (int) (Math.random() * 11); //edit: para que incluya n° 10
		int nro_Tamara = (int) (Math.random() * 11);
		int nro_Lucia = (int) (Math.random() * 11);

		int aux1;

		/*
		 * Defino una variable booleana para repetir la generación de números en caso
		 * que a uno de los niños le toque el mismo número de otro.
		 * 
		 */
		boolean banderaRepetida = true;

		/*
		 * Si el n° de Tamara no es igual que al de Javier y el número de Lucía no es
		 * igual al de Tamara y el número de Javier no es igual al de Lucía, detengo la
		 * bandera booleana.
		 * 
		 */
		
		System.out.println("Repartimos 3 números del 0-10: \n");

		do {
			if (nro_Tamara == nro_Javier) {

				nro_Tamara = (int) (Math.random() * 11);

			} else if (nro_Lucia == nro_Tamara || nro_Lucia == nro_Javier) {
				nro_Lucia = (int) (Math.random() * 11);
			} else {
				System.out.println("El n° que le tocó a Javier es: " + nro_Javier);
				System.out.println("El n° que le tocó a Tamara es: " + nro_Tamara);
				System.out.println("El n° que le tocó a Lucía es: " + nro_Lucia + "\n");
				banderaRepetida = false;
			}
		} while (banderaRepetida);

		/*
		 * Intercambian los números
		 * 
		 * Javier le da su número a Tamara, Tamara le da su número a Lucía y Lucía le da
		 * su número a Javier
		 * 
		 */

		aux1 = nro_Javier;

		nro_Javier = nro_Lucia;

		nro_Lucia = nro_Tamara;

		nro_Tamara = aux1;

		System.out.println("Los niños intercambian sus números: \n");

		System.out.println("El n° de Javier ahora es: " + nro_Javier);
		System.out.println("El n° de Tamara ahora es: " + nro_Tamara);
		System.out.println("El n° de Lucía ahora es : " + nro_Lucia + "\n");
	}
}
