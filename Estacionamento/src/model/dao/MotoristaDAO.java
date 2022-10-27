package model.dao;

import model.bean.Motorista;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class MotoristaDAO {

    
    
    public void create (Motorista v){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement ("INSERT INTO motorista(nomecompleto,gênero,RG,CPF,celular,email,senha) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(2, v.getNomecompleto());
            stmt.setBoolean(3, v.isGênero());
            stmt.setInt(1, v.getRG());
            stmt.setInt(1, v.getCPF());
            stmt.setInt(1, v.getCelular());
            stmt.setString(2, v.getEmail());
            stmt.setString(2, v.getSenha());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Motorista salvo com sucesso!");
                
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e);
        
        }finally{           
            ConnectionFactory.closeConnection(con, stmt);
        }


    }
    
}