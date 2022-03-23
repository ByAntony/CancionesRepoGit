
public class PruebaCancion {
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("Quiero Bailar", "Ivy Queen", 303, true);
		Cancion quintaCancion = new Cancion("Sensacion del Bloque", "de la Guetto",302,false);
		Cancion sextaCancion = new Cancion("Aparentemente", "Yaga y Mackie",504,true);
		

		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, cuartaCancion, quintaCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}


	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}


	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}


	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}
