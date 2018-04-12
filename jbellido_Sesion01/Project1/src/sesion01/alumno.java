package sesion01;

public class alumno {
    String sNombre;

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setNEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public int getNEdad() {
        return nEdad;
    }
    int nEdad;
    public alumno() {
        super();
    }


    public alumno(String sNombre, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.nEdad = nEdad;
    }

    public String SaludaBienvenida(String psNombre){
    
    return "Hola Mundo !!!. bienvenid@" + psNombre;
    }
    
    public static void main(String[] args) {
        
        alumno myAlumno = new alumno();
          
       for (int i = 0; i < 6; i++) {
        {
            System.out.println(i + myAlumno.SaludaBienvenida("Jacquelin"));
        };
            
       }

    }
    
}
