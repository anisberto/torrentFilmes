package br.com.torrent.dal;

import br.com.torrent.model.Cupon;
import br.com.torrent.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author edivan
 */
public class CuponDao {

    private Connection conexao;
    
    public CuponDao() throws Exception{
        conexao = Conexao.getInstance().getConnection();
    }

    public Cupon gerarRadon(int idRandon) throws Exception {
        Cupon cupon = new Cupon();
        String sql = "SELECT round(random() * 59 + 1) id_radon";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, idRandon);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                cupon.setPorcentagem(rs.getInt("id_radon"));
            }
        } catch (Exception erro) {
            throw new Exception("Erro ao buscar no banco de dados: Alunos!!\n" + erro.getMessage());
        }
        return cupon;
    }

}
