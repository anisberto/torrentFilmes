package br.com.torrent.bll;

import br.com.torrent.model.PlanoModel;
import br.com.torrent.model.UsuLoginModel;

public class ValidacoesBll {

    public static boolean validaUsuario(UsuLoginModel usuarioTela) throws Exception {
        UsuLoginBll usuarioLog = new UsuLoginBll();
        UsuLoginModel usuario = usuarioLog.findName(usuarioTela.getNome());
        if (usuario.getId() > 0 && usuario.getNome().equalsIgnoreCase(usuarioTela.getNome()) && usuario.getSenha().equalsIgnoreCase(usuarioTela.getSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarEntradaDeDadosPlano(PlanoModel plano) {
        return !plano.getNome().isEmpty() && plano.getPreco() > 0 && plano.getNome().length() >= 5 && plano.getNome().length() <= 20;
    }
}
