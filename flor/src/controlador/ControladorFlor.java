/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoFlor;
import javax.swing.JOptionPane;
import modelo.Flor;
import tela.manutencao.ManutencaoFlor;


/**
 *
 * @author Administrador
 */
public class ControladorFlor {

   public static void inserir(ManutencaoFlor man){
        Flor objeto = new Flor();
        objeto.setAno(Integer.parseInt(man.jtfano.getText()));
        objeto.setNome_popular(man.jtfnome_popular.getText());
        objeto.setNome_cientifico(man.jtfnome_cientifico.getText());
        objeto.setTamanho_petala(Double.parseDouble(man.jtftamanho_petala.getText()));
        objeto.setTamanho_sepala(Double.parseDouble(man.jtftamanho_sepala.getText()));
        boolean resultado = DaoFlor.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoFlor man){
        Flor objeto = new Flor();
        //definir todos os atributos
        objeto.setAno(Integer.parseInt(man.jtfano.getText()));
        objeto.setNome_popular(man.jtfnome_popular.getText());
        objeto.setNome_cientifico(man.jtfnome_cientifico.getText());
        objeto.setTamanho_petala(Double.parseDouble(man.jtftamanho_petala.getText()));
        objeto.setTamanho_sepala(Double.parseDouble(man.jtftamanho_sepala.getText()));
        objeto.setCodigo(Integer.parseInt(man.jtfcodigo.getText()));
        
        
        boolean resultado = DaoFlor.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

     public static void excluir(ManutencaoFlor man){
        Flor objeto = new Flor();
        objeto.setCodigo(Integer.parseInt(man.jtfcodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoFlor.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
