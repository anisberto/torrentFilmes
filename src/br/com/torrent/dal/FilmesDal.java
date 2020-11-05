package br.com.torrent.dal;

import br.com.torrent.bll.CategoriaBll;
import br.com.torrent.interfaces.FilmesInterfaces;
import br.com.torrent.model.FilmeModel;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilmesDal implements FilmesInterfaces {

    private Connection conexao;
    CategoriaBll catego = new CategoriaBll();

    public FilmesDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void adicionarFilmes(FilmeModel filme) {
        String sql = "INSERT INTO filmes (fil_titulo, fil_ano, fil_sinopse, fil_cat_iden) VALUES (?,?,?,? )";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setObject(1, filme.getTitulo());
            preparedStatement.setObject(2, filme.getAno());
            preparedStatement.setString(3, filme.getSinopse());
            preparedStatement.setObject(4, filme.getCategoria().getIden());
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            try {
                throw new Exception("Error ao inserir registro" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteFilmes(int id) {
        String sql = "DELETE FROM filmes WHERE fil_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            try {
                throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateFilmes(FilmeModel filme) {
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
            try {
                throw new Exception("Ocorreu um erro ao alterar este registro\n"
                        + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<FilmeModel> getAllFilmes() {
        List<FilmeModel> listFilmes = new ArrayList<FilmeModel>();
        String sql = "SELECT * FROM filmes";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                FilmeModel filme = new FilmeModel();
                filme.setIden(rs.getInt("fil_iden"));
                filme.setTitulo(rs.getString("fil_titulo"));
                filme.setAno(rs.getInt("fil_ano"));
                filme.setSinopse(rs.getString("fil_sinopse"));
                filme.setCategoria(catego.getCategoriasById(rs.getInt("fil_cat_iden")));
                listFilmes.add(filme);
            }
        } catch (SQLException erro) {
            try {
                throw new Exception("Ocorreu um erro ao consultar os registros de filmes\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<FilmeModel>) listFilmes;
    }

    @Override
    public FilmeModel getFilmesById(int id) {
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
                filme.setCategoria(catego.getCategoriasById(rs.getInt("fil_cat_iden")));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Filme!!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return filme;
    }

    @Override
    public FilmeModel findFilmesTitulo(String titulo) {
        FilmeModel filme = new FilmeModel();
        String sql = "SELECT * FROM filmes WHERE fil_titulo=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, titulo);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                filme.setIden(rs.getInt("fil_iden"));
                filme.setTitulo(rs.getString("fil_titulo"));
                filme.setAno(rs.getInt("fil_ano"));
                filme.setSinopse(rs.getString("fil_sinope"));
                filme.setCategoria(catego.getCategoriasById(rs.getInt("fil_cat_iden")));
            }
        } catch (Exception erro) {
            try {
                throw new Exception("Erro ao buscar no banco de dados: Filme!!\n" + erro.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FilmesDal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return filme;
    }

}
