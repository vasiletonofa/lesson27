package employee;

public class Tabla<E> {

    E figura;

    public Tabla(E figura) {
        this.figura = figura;
    }

    public void diseneazaFigura() {
         System.out.println(figura);
    }
}
