package project1;

public class ClasePrincipal {
    public ClasePrincipal() {
        super();
    }
    public static void main(String[] Args) {
           
           Profesor profe = new Profesor("Jose", "Servero Jaz", 38);
           profe.setNumCurso("2");
           profe.setFechIngresoProfesor("20-03-12");

           profe.mostrarNombreApellidosFechingreso();
       }  
    
}
