
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // instance variables - replace the example below with your own
    private String nombreAlimento;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;
    

    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombreAlimento, float proteinas, float carbohidratos, float grasas)
    {
        calorias =(proteinas *4)+(grasas*9)+(carbohidratos*4);
        this.nombreAlimento = nombreAlimento;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        
        this.grasas = grasas;
    }
    public void muestraDatos()
    {
        System.out.println("Nombre: " +nombreAlimento);
        System.out.println("Proteinas por cada 100 gramos: " +proteinas);
        System.out.println("Carbohidratos por cada 100 gramos: " +carbohidratos);
        System.out.println("Grasas por cada 100 gramos: " +grasas);
        System.out.println("Calorias :" +calorias);
        
        
        if(proteinas > carbohidratos && proteinas > grasas)
        {
            System.out.println("Compomente/s mayoritario/s: Proteinas");
        }
        else if(carbohidratos > proteinas && carbohidratos > grasas)
        {
            System.out.println("Compomente/s mayoritario/s: Carbohidratos");
        }
        else if( grasas > proteinas && grasas > carbohidratos)
        {
            System.out.println("Compomente/s mayoritario/s: Proteinas");
        }
        
        
        
    }

}
