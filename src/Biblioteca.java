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


}
