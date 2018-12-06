/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycar.view;

import java.util.Vector;

/**
 *
 * @author sorattorafa
 */
public class Cliente { 
    
    private String nome; 
    private String cpf; 
    private String datanasc; 
    private String sexo; 
    private String endereco; 
    private String email; 
    private String cel; 
    private String tel;  
    private String senha; 
    private String nroop; 

    public String getNroop() {
        return nroop;
    }

    public void setNroop(String nroop) {
        this.nroop = nroop;
    }
    
   
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

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

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    } 
    
    public void salvar(){ 
        BancodeDados.clientes.add(this); 
    } 

    
    
}
