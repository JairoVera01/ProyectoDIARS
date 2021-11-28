/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Usuario
 */
public class Sala {
    private int numeroSala;
    private int capacidadSala;
    private int reservaSala;
    private ArrayList<Butaca> listaButacas = new ArrayList<Butaca>();

    public Sala() {
    }

    public Sala(int numeroSala, int capacidadSala, int reservaSala) {
        this.numeroSala = numeroSala;
        this.capacidadSala = capacidadSala;
        this.listaButacas = new ArrayList<>();
        butacasOcupadas(reservaSala);
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

    public void setCapacidadSala(int capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    public List<Butaca> getListaButacas() {
        return listaButacas;
    }

    public void setListaButacas(ArrayList<Butaca> listaButacas) {
        this.listaButacas = listaButacas;
    }

    public void butacasOcupadas(int num_ocupadas){
         /*Se generá la Sala de la clase Butaca con la cantidad ingresada por el usuario*/
        Set<Integer> aux = new HashSet();
        /*El objeto aux tendrá valores aleatorios*/
        while(aux.size() < num_ocupadas)
            aux.add((int)(Math.random()*((this.getCapacidadSala()-1)-0+1)+0));
        List<Integer> reservados = new ArrayList<>(aux);
        /* Se agrega el objeto aux a la lista dinámica de objetos de la clase Butaca*/
        for (int i = 0; i < this.getCapacidadSala(); i++) {
            /*Se recorre la lista de objetos clase Butaca y se acumula las butacas*/
            listaButacas.add(new Butaca(i + 1));
        }
        for (int i = 0; i < reservados.size(); i++) {
            listaButacas.get(reservados.get(i)).setOcupado(true);
        }
    }
}
