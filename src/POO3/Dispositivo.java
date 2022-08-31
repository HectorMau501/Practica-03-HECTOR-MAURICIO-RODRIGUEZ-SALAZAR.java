
package POO3;


public class Dispositivo 
{
    //Atributos
    private String tipo;
    private String folio;
    private float medidaPantalla;
    //int length;
    
    //Constructor
    
    public Dispositivo(){}//Vacio
    public Dispositivo(String tipo, String folio, float medidaPantalla)
    {
        this.tipo = "";
        this.folio = "";
        this.medidaPantalla = 0;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public void setFolio(String folio) 
    {
        this.folio = folio;
    }

    public String getFolio()
    {
        return folio;
    }
        
    public void setMedidaPantalla(float medidaPantalla) 
    {
    this.medidaPantalla = medidaPantalla;
    }

    public float getMedidaPantalla() 
    {
        return medidaPantalla;
    }   
    
    
}
