package AFP_Persona;

import javax.swing.JOptionPane;

public class AFP_UsuarioPersona {
     public int NumeroCuenta;
     public String EstadoCuenta;
     
    public AFP_UsuarioPersona(String estadoCuenta,int numeroCuenta) {
        this.NumeroCuenta = numeroCuenta;
        this.EstadoCuenta= estadoCuenta;
    }
     // METODOS VACIOS PARA INSTANCIARLOS EN CLASES HIJO.
   public void AporteACuenta(){
}  
  public void EstadoCuenta(){
        JOptionPane.showMessageDialog(null, "El estado de su cuenta es: "+EstadoCuenta);
  }
}
    

