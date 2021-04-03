
public class Persona
{
    String nombre;
    
    public String saludar(){
        String saludo = "Hola";
        return saludo;
    }
    
    public String saludar(String nom){
        String saludo = "Hola mi nombre es " + nombre + " mucho gusto " + nom;
        return saludo;
    }
}
