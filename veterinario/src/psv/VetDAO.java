/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class VetDAO {

    private Connection con;

    public VetDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(VetBean vet) {
        String sql = "insert into paciente(id, nome,idade,raca,porte,nascimento,vacinado,responsavel,telefone,cpf,endereco,bairro,numero,sintomas)values(null,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, vet.getId());
            ps.setString(2, vet.getNome());
            ps.setString(3, vet.getIdade());
            ps.setString(4, vet.getRaca());
            ps.setString(5, vet.getPorte());
            ps.setString(6, vet.getNasc());
            ps.setString(7, vet.getVacinado());
            ps.setString(8, vet.getResponsavel());
            ps.setString(9, vet.getTelefone());
            ps.setString(10, vet.getCpf());
            ps.setString(11,vet.getEndereco());
            ps.setString(12,vet.getBairro());
            ps.setString(13,vet.getNumero());
            ps.setString(14,vet.getSintomas());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public String alterar(VetBean vet){
        String sql = "update veterinario set nome = ?,descricao = ?,modelo = ?, marca = ?, conversivel = ?,janelas = ?, portas = ?, rodas = ?, 4x4 = ?, porte = ?, blindado = ?";
        sql += " where id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, vet.getId());
            ps.setString(2, vet.getIdade());
            ps.setString(3, vet.getRaca());
            ps.setString(4, vet.getPorte());
            ps.setString(5, vet.getNasc());
            ps.setString(6, vet.getVacinado());
            ps.setString(7, vet.getResponsavel());
            ps.setString(8, vet.getTelefone());
            ps.setString(9, vet.getCpf());
            ps.setString(10, vet.getEndereco());
            ps.setString(11, vet.getBairro());
            ps.setString(12, vet.getNumero());
            ps.setString(13, vet.getSintomas());
            ps.setString(14, vet.getNome());
        if(ps.executeUpdate() > 0){
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch(SQLException e) {
                    return e.getMessage();
                    }
    }
    
    public String excluir(VetBean vet){
        String sql = "delete from vet where id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, vet.getId());
        if(ps.executeUpdate() > 0){
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch(SQLException e) {
            return e.getMessage();
        }
    }
    
    public List<VetBean> listarTodos(){
        String sql = "select * from vet";
        
        List<VetBean> listaPet = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs != null) {
                while(rs.next()){
                    VetBean cb = new VetBean();
                    cb.setId(rs.getString(1));
                    cb.setNome(rs.getString(2));
                    cb.setIdade(rs.getString(3));
                    cb.setRaca(rs.getString(4));
                    cb.setPorte(rs.getString(5));
                    cb.setNasc(rs.getString(6));
                    cb.setVacinado(rs.getString(7));
                    cb.setResponsavel(rs.getString(8));
                    cb.setTelefone(rs.getString(9));
                    cb.setCpf(rs.getString(10));
                    cb.setEndereco(rs.getString(11));
                    cb.setBairro(rs.getString(12));
                    cb.setNumero(rs.getString(13));
                    cb.setSintomas(rs.getString(14));
                    listaPet.add(cb);
                }
                    return listaPet;
            } else {
                return null;
            }
        } catch(SQLException e) {
            return null;
        }
    }

}


