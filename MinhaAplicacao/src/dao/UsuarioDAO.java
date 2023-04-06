/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory; 
import modelo.Usuario; 
import java.sql.*; 
import java.sql.PreparedStatement;

public class UsuarioDAO {
    Long ID;
    String NOME;
    String CPF;
    String EMAIL;
    String TELEFONE;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        
       String sql = "INSERT INTO usuario(NOME,CPF,EMAIL,TELEFONE) VALUES(?,?,?,?)";
    try{
        
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, usuario.getNOME() );
        stmt.setString(2,usuario.getCPF() );
        stmt.setString(3, usuario.getEMAIL());
        stmt.setString(4,usuario.getTELEFONE());
        stmt.execute();
        stmt.close();
        
    }catch (SQLException u){
        throw new RuntimeException(u);
    }     
    
    }
}
