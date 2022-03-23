/**
 * 
 * @author byron
 * @version 02.2022
 *
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores

	/**
	 * Este constructor esta sin parámetros inicializado sin titulo de duración cero y sonando false
	 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * Este constructor tiene 2 parámetros el titulo de la cancion y la duracion de dicha cancion 
	 * @param titulo	Nos devuelve un String con el titulo de la cancion
	 * @param duracion	Un int indicando en numero cuanto dura la canción
	 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * Este constructor tiene cuatro parámetros en los cuales se pasan el titulo, la duracion que esta sonando y el grupo de la cancion.
	 * @param titulo	
	 * @param grupo	  String con el nombre del grupo de la cancion que esta sonando 
	 * @param duracion
	 * @param sonando	Es un boolen devolviendonos true si esta sonando y false cuando no suene 
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * En este metodo nos devolvera false cuando la cancion no este sonando y true cuando se este reproduciendo
	 * @return true sonando si la cancion se esta reproduciendo y false si no 
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	/**
	 * En este metodo cuando la cancion esta parada te devolvera un false y cuando este sonando nos devolvera un true 
	 * @return	false cancion parada y true cuando este sonando y la para
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	/**
	 * 
	 * @return devuelve el titulo  
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Afirmamos que es el titulo al que nos referimos con el this
	 * @param titulo de la cancion 
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Es el nombre del grupo de la cancion 
	 * @return nombre del grupo
	 */
	public String getGrupo() {
		return grupo;
	}
	/**
	 * Nos referimos al grupo de la cancion
	 * @param grupo
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	/**
	 * Es la duracion de la cancion
	 * @return	En numeros cuanto dura la cancion 
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * La duracion de la cancion 
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * 
	 * @return false o true 
	 */
	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	/**
	 * 
	 * @param cancion
	 * @return
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}

	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}

	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}
