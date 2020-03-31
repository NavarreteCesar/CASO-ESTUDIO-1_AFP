package AFP_Persona;

import javax.swing.JOptionPane;

public class AFP_NoEmpleado extends AFP_UsuarioPersona {
    public double Aporte;

    public AFP_NoEmpleado(String estadoCuenta,int numeroCuenta) {
        super(estadoCuenta,numeroCuenta);
    }
    
    @Override
    public void AporteACuenta(){
        JOptionPane.showMessageDialog(null, "Su numero de cuenta: "+NumeroCuenta);
        Aporte=Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto depositara a la cuenta? "));
        JOptionPane.showMessageDialog(null, "El deposito ha sido de: "+Aporte+" . Realizado exitosamente");
    }
    
    @Override
    public void EstadoCuenta(){
        if(Aporte>0){
            JOptionPane.showMessageDialog(null, "Estado de cuenta: Activo");
        }else{
             JOptionPane.showMessageDialog(null, "Estado de cuenta: Inactivo");
        }
    }
}