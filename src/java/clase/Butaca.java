/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Usuario
 */
public class Butaca {
    private int numeroButaca;
    private boolean ocupado;

    public Butaca() {
        this.ocupado = false;
    }

    public Butaca(int numeroBuataca) {
        this.ocupado = false;
        this.numeroButaca = numeroBuataca;
    }

    public int getNumeroBuataca() {
        return numeroButaca;
    }

    public void setNumeroBuataca(int numeroBuataca) {
        this.numeroButaca = numeroBuataca;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
