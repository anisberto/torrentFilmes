package br.com.torrent.bll;

import br.com.torrent.model.UsuLoginModel;

public class ValidacoesBll {

    public static boolean validaUsuario(UsuLoginModel usuarioTela) throws Exception {
        UsuLoginBll usuarioLog = new UsuLoginBll();
        UsuLoginModel usuario = usuarioLog.findName(usuarioTela.getNome());
        if (usuario.getNome().equalsIgnoreCase(usuarioTela.getNome()) && usuario.getSenha().equalsIgnoreCase(usuarioTela.getSenha())) {
            return true;
        }
        return false;
    }
}
