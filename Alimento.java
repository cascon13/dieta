
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    //Variable de tipo String que nos indica el nombre del alimento.
    private String nombreAlimento;
    //Variable de tipo float que nos indica las proteinas.
    private float proteinas;
    //Variable de tipo float que nos indica los carbohidratos.
    private float carbohidratos;
    //Variable de tipo float que nos indica las grasas.
    private float grasas;
    //Variable de tipo float que nos indica las calorias
    private float calorias;
   

    /**
     * Constructor de la clase Alimento.
     */
    public Alimento(String nombreAlimento, float proteinas, float carbohidratos, float grasas)
    {
        //Inicializamos aqui las variables.
        calorias =(proteinas *4)+(grasas*9)+(carbohidratos*4);
        this.nombreAlimento = nombreAlimento;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
    }
    /**
     * Metodo que muestra los datos de los alimentos por pantalla.
     */
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
    
    /**
     * Metodo que nos devuelve la cantidad de proteinas.
     */
    public float getProteinas()
    {
        return proteinas;
    }
    
    /**
     * Metodo que nos devuelve la cantidad de grasas.
     */
    public float getGrasas()
    {
        return grasas;
    }
    
    /**
     * Metodo que nos devuelve la cantidad de carbohidratos.
     */
    public float getCarbohidratos()
    {
        return carbohidratos;
    }
    
    /**
     * Metodo que nos devuelve la cantidad de calorias.
     */
    public float getCalorias()
    {
        return calorias;
    }

}
