/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycar.view;

/**
 *
 * @author sorattorafa
 */
public class Aluguelveic {  
     private String cpfcliente; 
     private String placaveic; 
     private String dataaluguel; 
     private String idfilial; 
     private String pendente; 

    public String getPendente() {
        return pendente;
    }

    public void setPendente(String pendente) {
        this.pendente = pendente;
    }
     

    public String getCpfcliente() {
        return cpfcliente;
    }

    public void setCpfcliente(String cpfcliente) {
        this.cpfcliente = cpfcliente;
    }

    public String getPlacaveic() {
        return placaveic;
    }

    public void setPlacaveic(String placaveic) {
        this.placaveic = placaveic;
    }

    public String getDataaluguel() {
        return dataaluguel;
    }

    public void setDataaluguel(String dataaluguel) {
        this.dataaluguel = dataaluguel;
    }

    public String getIdfilial() {
        return idfilial;
    }

    public void setIdfilial(String idfilial) {
        this.idfilial = idfilial;
    }
      public void salvar(){ 
        BancodeDados.alugueis.add(this); 
    } 
}
