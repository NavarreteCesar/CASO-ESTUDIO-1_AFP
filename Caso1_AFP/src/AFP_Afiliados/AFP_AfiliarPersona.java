package AFP_Afiliados;

public class AFP_AfiliarPersona {
    
    protected String NombreCompleto;
    protected float NumeroISSS;
    protected float CarnetINPEP;

    public AFP_AfiliarPersona(
            String nombreCompleto, 
            float carnetISSS, 
            float carnetINPEP) {
        this.NumeroISSS = carnetISSS;
        this.NombreCompleto=nombreCompleto;
        this.CarnetINPEP = carnetINPEP;
    }
    // METODOS VACIOS PARA INSTANCIARLOS EN CLASES HIJO.
    public void IngresarDatos(){
    }
    public void MostrarDatos(){
    }
}