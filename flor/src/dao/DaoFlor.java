/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;
/**
 *
 * @author Administrador
 */
public class DaoFlor {
     public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO flor (ano, nome_popular, nome_cientifico, tamanho_petala, tamanho_sepala) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getAno());
            ps.setString(2, objeto.getNome_popular());
            ps.setString(3, objeto.getNome_cientifico());
            ps.setDouble(4, objeto.getTamanho_petala());
            ps.setDouble(5, objeto.getTamanho_sepala());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
 public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setAno(2008);
        objeto.setNome_popular("girassol");
        objeto.setNome_cientifico("girapetulus");
        objeto.setTamanho_petala(12.3);
        objeto.setTamanho_sepala(14.4);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

  public static boolean alterar(Flor objeto) {
        String sql = "UPDATE flor SET ano = ?, nome_popular = ?, nome_cientifico = ?, tamanho_petala = ?, tamanho_sepala = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getAno());
            ps.setString(2, objeto.getNome_popular()); 
            ps.setString(3, objeto.getNome_cientifico());
            ps.setDouble(4, objeto.getTamanho_petala());
            ps.setDouble(5, objeto.getTamanho_sepala());
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
  
   public static boolean excluir(Flor objeto) {
        String sql = "DELETE FROM flor WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
  
}
