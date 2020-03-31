package AFP_Afiliados;

import javax.swing.JOptionPane;

public class AFP_Afiliar_MenorEdad extends AFP_AfiliarPersona {
    
     public float CarnetMenoridad;

    public AFP_Afiliar_MenorEdad(
            String nombreCompleto,
            float carnetMenoridad, 
            float numeroISSS, 
            float carnetINPEP) {
        super(nombreCompleto,numeroISSS, carnetINPEP);
        this.CarnetMenoridad = carnetMenoridad;
    }
    @Override
    public void MostrarDatos(){
       JOptionPane.showMessageDialog(null, "Informacion.\n"
        +"Nombre completo: "+NombreCompleto
        +"\nNumero ISSS: "+NumeroISSS
        +"\nCarnet INPEP: "+CarnetINPEP
        + " \nCarnet de Menoridad: "+CarnetMenoridad);
        JOptionPane.showMessageDialog(null, "HAZ SIDO AFILIADO EXITOSAMENTE "+NombreCompleto+ "BIENVENIDO A AFP");
    }
}

   
