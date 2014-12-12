
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // Variable de tipo String que indica el nombre del usuario.
    private String nombre;
    //Variable de tipo float que nos indica las proteinas ingeridas.
    private float proteinasIngeridas;
    //Variable de tipo float que nos indica los carbohidratos ingeridos.
    private float carbohidratosIngeridos;
    //Variable de tipo float que nos indica las grasas ingeridas.
    private float grasasIngeridas;
    //Variable de tipo float que nos indica las calorias.
    private float caloriasIngeridas;

    /**
     * Construcor de la clase Usuario.
     */
    public Usuario(String nombre)
    {
        //Inicializamos las variables.
        this.nombre =nombre;
        proteinasIngeridas =0;
        carbohidratosIngeridos=0;
        grasasIngeridas=0;
        
    }

    /**
     * Metodo el cual hace que un usuario coma un determinada cantidad de un alimento.
     */
    public void comer(Alimento comida, float cantidad)
    {
        proteinasIngeridas = comida.getProteinas()*cantidad/100;
        carbohidratosIngeridos = comida.getCarbohidratos()*cantidad/100;
        grasasIngeridas = comida.getGrasas()*cantidad/100;
        caloriasIngeridas = comida.getCalorias()*cantidad/100;
    }
    
    /**
     * Metodo el cual nos muestra por pantalla los gramos tanto de proteinas, carbohidratos,
     * grasas y calorias ingeridas.
     */
    public void resultado()
    {
        System.out.println("Nombre:" +nombre);
        System.out.println("Gramos de proteinas ingeridos: "+ proteinasIngeridas);
        System.out.println("Gramos de carbohidratos ingeridos: "+ carbohidratosIngeridos);
        System.out.println("Gramos de grasas ingeridos: "+ grasasIngeridas);
        System.out.println("Calorias ingeridas: " + caloriasIngeridas);
    }
}
