
package POO;


public class Trabajador extends Persona
{
    private String puesto;
    private int horas;

    public Trabajador(String puesto, int horas, String nombre, int edad, float altura) {
        super(nombre, edad, altura);
        this.puesto = "";
        this.horas = 0;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
    
}
