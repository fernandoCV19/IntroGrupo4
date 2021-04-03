
public class Robot
{
    public void ejemplo(){

        Fraccion fraccion = new Fraccion(3,4);
    }

    public int suma(int num1, int num2){
        int respuesta;
        respuesta = num1 + num2;
        return respuesta;
    }

    // 4/5 -> 5/5
    public Fraccion incrementar(Fraccion fraccion){
        fraccion.numerador = fraccion.numerador + 1;
        
        return fraccion;
    }
    
}
