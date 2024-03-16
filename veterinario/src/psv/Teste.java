/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class Teste {
public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();

        VetBean cb = new VetBean();
        VetDAO cd = new VetDAO(con);
        
        cb.setNome("AAA1234");
        System.out.println(cd.inserir(cb));

        List<VetBean> lista = cd.listarTodos();

        if (lista != null) {
            for (VetBean cachorro : lista) {
                System.out.println("Placa: " + cachorro.getNome());
                
            }
        }
        
        Conexao.fecharConexao(con);
    }
    
}
