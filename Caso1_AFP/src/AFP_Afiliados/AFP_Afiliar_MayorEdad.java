package AFP_Afiliados;

import javax.swing.JOptionPane;
/**
 * @author César Navarrete
 *  PROGRAMACION ORIENTADA A OBJETOS || CICLO 01-2020
 *  U20181587
 */
public class AFP_Afiliar_MayorEdad extends AFP_AfiliarPersona{
    
    public float NumeroDUI;
    public float NumeroNIT;

    public AFP_Afiliar_MayorEdad(
            String nombreCompleto,
            float numeroDUI, 
            float numeroNIT, 
            float carnetISSS, 
            float carnetINPEP) {
        super(nombreCompleto, carnetISSS, carnetINPEP);
        this.NumeroDUI = numeroDUI;
        this.NumeroNIT = numeroNIT;
    }

    @Override
    public void MostrarDatos(){
       JOptionPane.showMessageDialog(null, "Informacion.\n"
        +"Nombre completo: "+NombreCompleto
        +"\nNumero ISSS: "+NumeroISSS
        +"\nCarnet INPEP: "+CarnetINPEP
        +"\nNumero de DUI: "+NumeroDUI
        +"\nNumero de NIT: "+NumeroNIT);
       JOptionPane.showMessageDialog(null, "HAZ SIDO AFILIADO EXITOSAMENTE "+NombreCompleto +" BIENVENIDO A AFP");
    }
}
    