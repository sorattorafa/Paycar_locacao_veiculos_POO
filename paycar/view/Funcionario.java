/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycar.view;

import paycar.view.BancodeDados;
/**
 *
 * @author sorattorafa 
 * 
 */ 

public class Funcionario { 
    
    private String nome; 
    private String cpf; 
    private String tel; 
    private String email; 
    private String horario; 
    private String datacont; 

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDatacont() {
        return datacont;
    }

    public void setDatacont(String datacont) {
        this.datacont = datacont;
    } 
    
    public void salvar(){ 
        BancodeDados.funcionarios.add(this); 
    } 

  
}
