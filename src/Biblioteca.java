public class Biblioteca {

    private Libro[] catalogo;
    private final int CANT_MAX_LIBROS;


    public Biblioteca(int cantidad_maxima_libros) {
        CANT_MAX_LIBROS = cantidad_maxima_libros;
        catalogo = new Libro[CANT_MAX_LIBROS];

    }


    /**
     * Busca el libro en el catalogo por id
     * @param id_libro id del libro buscado
     * @return la posicion del libro
     */
    public Libro findLibro(int id_libro){
        boolean seguirBuscando = true;
        Libro libroEncontrado = null;

        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if( catalogo[i] != null && catalogo[i].getId() == id_libro){
                libroEncontrado = catalogo[i];
                seguirBuscando = false;
            }
        }

        return libroEncontrado;
    }

    /**
     * Busca el primer hueco libre en el cataloga
     * @return -1 si no hay hueco libre o la posicion libre
     */
    private int buscarPrimerHuecoLibre(){
        int poscionLibre = -1;
        boolean seguirBuscando = true;

        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if (catalogo[i] == null){
                poscionLibre = i;
                seguirBuscando = false;
            }
        }

        return poscionLibre;
    }

    /**
     * Recibe y añade el libro no duplicado siempre que haya hueco
     * @param libro libro recibido
     * @return true si se ha añadido, false si no se ha podido añadir
     */
    public boolean añadirLibro(Libro libro){
        boolean libroAñadido = false;
        int posicionLibro;

        //Comprobar si existe
        if (findLibro(libro.getId()) == null){
            posicionLibro = buscarPrimerHuecoLibre();
            //Buscar Hueco
                //si hay ->
            if(posicionLibro >= 0){
                //añadimos
                //libroAñadido = true
                catalogo[posicionLibro] = libro;
                libroAñadido = true;
            }
                //no hay -> libroAñadido = false
        }

        return libroAñadido;
    }

    /**
     * Recibe un id de un libro y lo borra
     * @param id_libro Identificador del libro
     * @return el libro eliminado o null en caso de no encontrarlo
     */
    public Libro eliminarLibro(int id_libro){
        Libro libroEncontrado = null;
        boolean seguirBuscando = true;

        //Comprobamos que existe. Necesitamos la poscion y el libro
        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if (catalogo[i] != null && catalogo[i].getId() == id_libro){
                libroEncontrado = catalogo[i]; // Guardamos el libro
                catalogo[i] = null;            // vaciamos la poscicion
                seguirBuscando = false;        // para que no sigua buscando
            }
        }
        return libroEncontrado;

    }
}
