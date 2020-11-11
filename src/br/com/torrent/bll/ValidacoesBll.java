package br.com.torrent.bll;

import br.com.torrent.dal.UsuLoginDal;
import br.com.torrent.model.PlanoModel;
import br.com.torrent.model.UsuLoginModel;
import br.com.torrent.model.UsuarioModel;

public class ValidacoesBll {

    public static boolean validaUsuario(UsuLoginModel usuarioTela) throws Exception {
        UsuLoginDal usuarioLog = new UsuLoginDal();
        UsuLoginModel usuario = usuarioLog.findName(usuarioTela.getLogin());

        if (usuario.getLogin().contains(usuarioTela.getLogin()) && usuario.getSenha().equalsIgnoreCase(usuarioTela.getSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarEntradaDeDadosPlano(PlanoModel plano) {
        return !plano.getNome().isEmpty() && plano.getPreco() > 0 && plano.getNome().length() >= 5 && plano.getNome().length() <= 20;
    }

    public static boolean validarAlteracao(PlanoModel plano) {
        return !plano.getNome().isEmpty() && plano.getPreco() > 0 && plano.getNome().length() >= 5 && plano.getNome().length() <= 20;
    }

}
