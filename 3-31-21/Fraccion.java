
public class Fraccion
{
    int numerador;
    int denominador;

    Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion multiplicar(Fraccion fraccion){
        int num;
        int dem;
        Fraccion fracc;
        
        num = fraccion.numerador * numerador;
        dem = fraccion.denominador * denominador;
        fracc = new Fraccion(num, dem);
        
        return fracc;
    }
    
    public Fraccion multiplicar2(Fraccion fraccion){
        fraccion.numerador = fraccion.numerador * numerador;
        fraccion.denominador = fraccion.denominador * denominador;
        
        return fraccion;
    }    
    
    /*
            
        switch(fraccion.numerador){
            case 1: //Haz tal cosa;
                    break;
            case 2:
                    break;
            default: //Haz tal cosa
        }
    */
}
