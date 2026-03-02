public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(10);
        Libro libro1 = new Libro(1,"El Quijote","Miguel de Cervantes",800);

        Libro libro2 = new Libro(2,"El Gato con Botas", "Charles Perrault",100);

        System.out.println(biblioteca.findLibro(1));

        System.out.println(biblioteca.añadirLibro(libro1));
        System.out.println(biblioteca.añadirLibro(libro2));

        System.out.println(biblioteca.obtenerCatalogo());

    }
}
