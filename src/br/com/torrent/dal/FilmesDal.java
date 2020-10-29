package br.com.torrent.dal;

import br.com.torrent.bll.CategoriaBll;
import br.com.torrent.model.FilmeModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmesDal {

    private Connection conexao;
    CategoriaBll catego = new CategoriaBll();

    public FilmesDal() throws Exception {
        conexao = (Connection) Conexao.getInstance();
    }

    public void adicionarFilme(FilmeModel filme) throws Exception {
        String sql = "INSERT INTO filmes (fil_titulo, fil_ano, fil_sinope, fil_cat_iden) VALUES (?,?,?,?, default )";

        try { // preparando a conexao;
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setObject(1, filme.getTitulo());
            preparedStatement.setObject(2, filme.getAno());
            preparedStatement.setObject(3, filme.getSinopse());
            preparedStatement.setObject(4, filme.getCategoria());

            preparedStatement.executeUpdate(); // executa o comando da String sql;
        } catch (SQLException erro) {
            throw new Exception("Error ao inserir registro" + erro.getMessage());
        }
    }

    public void deleteUsuario(int id) throws Exception {
        String sql = "DELETE FROM filmes WHERE fil_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                    + erro.getMessage());
        }
    }

    public void updateFilme(FilmeModel filme) throws Exception {
        String sql = "UPDATE filmes set  fil_titulo=?, fil_ano=?, fil_sinope=?, where fil_cat_iden=?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, filme.getTitulo());
            preparedStatement.setInt(2, filme.getIden());
            preparedStatement.setInt(3, filme.getAno());
            preparedStatement.setString(4, filme.getSinopse());
            preparedStatement.setString(5, filme.getCategoria().getNome());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }
    }

    public List<FilmeModel> getAllFilme() throws Exception {
        List<FilmeModel> listFilmes = new ArrayList<FilmeModel>();
        // buscar por ordena��o por ID;
        String sql = "SELECT * FROM filmes";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            //        ? enquato estive proximo fa�a;
            while (rs.next()) {
                //     ? fazendo um estacia��o com o [new]
                FilmeModel filme = new FilmeModel();
                filme.setIden(rs.getInt("fil_iden"));
                filme.setTitulo(rs.getString("fil_titulo"));
                filme.setAno(rs.getInt("fil_ano"));
                filme.setSinopse(rs.getString("fil_sinope"));
                filme.setCategoria(catego.consultarCategoriaPorId(rs.getInt("fil_cat_iden")));
                listFilmes.add(filme);
                System.out.println("teste 1");
            }
        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de filmes\n" + erro.getMessage());
        }
        return listFilmes;
    }

    public FilmeModel getFilmeById(int id) throws Exception {
        FilmeModel filme = new FilmeModel();
        String sql = "SELECT * FROM filmes WHERE fil_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                filme.setIden(rs.getInt("fil_iden"));
                filme.setTitulo(rs.getString("fil_titulo"));
                filme.setAno(rs.getInt("fil_ano"));
                filme.setSinopse(rs.getString("fil_sinope"));
                filme.setCategoria(catego.consultarCategoriaPorId(rs.getInt("fil_cat_iden")));
            }
        } catch (Exception erro) {
            throw new Exception("Erro ao buscar no banco de dados: Filme!!\n" + erro.getMessage());
        }
        return filme;
    }

}
