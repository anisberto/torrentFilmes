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
import java.util.List;


public class CategoriaDal implements CategoriasInterfaces{

    private Connection conexao;

    public CategoriaDal() throws Exception {
        conexao = (Connection) Conexao.getInstance();
    }

    public void adicionarCategoria(CategoriaFilmesModel categoria) throws Exception {
        String sql = "INSERT INTO categorias (cat_nome) VALUES (?, default )";

        try { // preparando a conexao;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setObject(1, categoria.getNome());

            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro Categoria" + erro.getMessage());
        }
    }

    public void deleteCategoria(int id) throws Exception {
        String sql = "DELETE FROM categorias WHERE cat_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                    + erro.getMessage());
        }
    }

    public void updateCategoria(CategoriaFilmesModel categoria) throws Exception {
        String sql = "UPDATE categorias set  cat_nome=?, where fil_cat_iden=?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, categoria.getNome());
            preparedStatement.setInt(2, categoria.getIden());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }
    }

    public List<CategoriaFilmesModel> getAllCategoria() throws Exception {
        List<CategoriaFilmesModel> listCategoria = new ArrayList<CategoriaFilmesModel>();
        // buscar por ordena��o por ID;
        String sql = "SELECT * FROM categorias";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            //        ? enquato estive proximo fa�a;
            while (rs.next()) {
                //     ? fazendo um estacia��o com o [new]
                CategoriaFilmesModel categoria = new CategoriaFilmesModel();
                categoria.setIden(rs.getInt("cat_iden"));
                categoria.setNome(rs.getString("cat_nome"));
                listCategoria.add(categoria);
                System.out.println("teste 1");
            }
        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de Categoria\n" + erro.getMessage());
        }
        return listCategoria;
    }

    public CategoriaFilmesModel getCategoriaById(int id) throws Exception {
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
            throw new Exception("Erro ao buscar no banco de dados: Categoria!!\n" + erro.getMessage());
        }
        return categoria;
    }

    @Override
    public void adicionarCategorias(CategoriaFilmesModel categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCategorias(CategoriaFilmesModel categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCategorias(CategoriaFilmesModel categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CategoriaFilmesModel> getAllCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaFilmesModel getCategoriasById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaFilmesModel findCategoriasName(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
