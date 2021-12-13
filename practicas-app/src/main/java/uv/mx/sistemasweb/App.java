package uv.mx.sistemasweb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/aprobado", (req, res) -> "Calificacion: 7");
    }
}
