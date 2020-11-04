package br.com.torrent.dal;

import br.com.torrent.interfaces.CategoriasInterfaces;
import br.com.torrent.model.CategoriaFilmesModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaDal implements CategoriasInterfaces {

    private Connection conexao;

    public CategoriaDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarCategorias(CategoriaFilmesModel categoria) {
        String sql = "INSERT INTO categorias (cat_nome) VALUES (?, default )";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setObject(1, categoria.getNome());
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            try {
                throw new Exception("Error ao inserir registro Categoria" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteCategorias(int id) {
        String sql = "DELETE FROM categorias WHERE cat_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            try {
                throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateCategorias(CategoriaFilmesModel categoria) {
        String sql = "UPDATE categorias set  cat_nome=?, where fil_cat_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, categoria.getNome());
            preparedStatement.setInt(2, categoria.getIden());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            try {
                throw new Exception("Ocorreu um erro ao alterar este registro\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<CategoriaFilmesModel> getAllCategorias() {
        ArrayList<CategoriaFilmesModel> listCategoria = new ArrayList<CategoriaFilmesModel>();
        String sql = "SELECT * FROM categorias";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                CategoriaFilmesModel categoria = new CategoriaFilmesModel();
                categoria.setIden(rs.getInt("cat_iden"));
                categoria.setNome(rs.getString("cat_nome"));
                listCategoria.add(categoria);
                System.out.println("teste 1");
            }
        } catch (SQLException erro) {
            try {
                throw new Exception("Ocorreu um erro ao consultar os registros de Categoria\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listCategoria;
    }

    @Override
    public CategoriaFilmesModel getCategoriasById(int id) {
        CategoriaFilmesModel categoria = new CategoriaFilmesModel();
        String sql = "SELECT * FROM categorias WHERE cat_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                categoria.setIden(rs.getInt("cat_iden"));
                categoria.setNome(rs.getString("cat_nome"));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Categoria!!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return categoria;
    }

    @Override
    public CategoriaFilmesModel findCategoriasName(String nome) {
        CategoriaFilmesModel categoria = new CategoriaFilmesModel();
        String sql = "SELECT * FROM categorias WHERE cat_nome=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                categoria.setIden(rs.getInt("cat_iden"));
                categoria.setNome(rs.getString("cat_nome"));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Categoria!!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(CategoriaDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return categoria;
    }
}
