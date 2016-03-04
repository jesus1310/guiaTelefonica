/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    private int numeroTestsFallados;

    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public TestAgendaTelefonica()
    {   
        numeroTestsFallados = 0;
        AgendaTelefonica agenda = new AgendaTelefonica();
        numeroTestsFallados += testea(null,agenda.lookupNumber("Pepe"),"lookupNumber(String name)");
        agenda.enterNumber("Pepe","600123456");
        agenda.enterNumber("Paco","600987654");
        numeroTestsFallados += testea("600123456",agenda.lookupNumber("Pepe"),"lookupNumber(String name)");
        numeroTestsFallados += testea(null,agenda.lookupNumber("Pepito"),"lookupNumber(String name)");
        
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }

    /**
     * Método para testear la clase AgendaTelefonica
     */
    public int testea(Object valorEsperado, Object valorObtenido, String nombreMetodo){
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreMetodo);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreMetodo);
            System.out.println("Valor obtenido: " + valorObtenido + 
                " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }
}