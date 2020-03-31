/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AFP_Persona;

import javax.swing.JOptionPane;

/**
 *
 * @author César Navarrete
 */
public class AFP_EmpleadoVigente extends AFP_UsuarioPersona{
    public double Aporte;
    public double AporteDeEmpleador;
    public double Sueldo;

    public AFP_EmpleadoVigente(String EstadoCuenta,double sueldo, int NumeroDeCuenta,double aporte) {
        super(EstadoCuenta,NumeroDeCuenta);
        this.Sueldo=sueldo;
        this.AporteDeEmpleador=aporte;
    }
    // EL 10% DEL SUELDO
    @Override
    public void AporteACuenta(){
        
       Aporte = Sueldo*0.10;
       JOptionPane.showMessageDialog(null, "Numero de cuenta: "+NumeroCuenta);
       JOptionPane.showMessageDialog(null, "El aporte de su jefe: "+AporteDeEmpleador);
       JOptionPane.showMessageDialog(null, "Aporte total mensual: $"+Aporte+AporteDeEmpleador);
    }
    
}