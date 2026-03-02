public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int numPaginas;


    /**
     * Metodo constructor ded Libros
     * @param id identificador del libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param numPaginas numero de paginas del libro
     */
    public Libro(int id, String titulo, String autor, int numPaginas) {
        int numHojas; // variable del metodo

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

        numHojas = numPaginas/2;
    }

    /**
     * Devuelve el id del libro
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el titulo del libro
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Libro: {");
        sb.append(String.format(" id: %d;", id));
        sb.append(String.format(" titulo: %s;", titulo));
        sb.append(String.format(" autor: %s;",  autor));
        sb.append(String.format(" numPaginas: %d;",  numPaginas));
        sb.append("}");

        return sb.toString();
    }

    /**
     * Actualiza el numero de paginas que tiene el libro. COmprueba que el nuemro recibido sea mayor que 0.
     * @param numPaginas nueva cantidad de paginas
     * @return true si ha podido cambiarse, false si no ha podido
     */
    public boolean updateNumPaginas(int numPaginas) {
        boolean resultado;

        if(numPaginas <= 0) {
            resultado = false;
        } else  {
            this.numPaginas = numPaginas;
            resultado = true;
        }
        return resultado;
    }
}
