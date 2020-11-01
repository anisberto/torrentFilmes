package br.com.torrent.bll;

import br.com.torrent.model.UsuLoginModel;

public class ValidacoesBll {

    public static boolean validaUsuario(UsuLoginModel usuarioTela) throws Exception {
        UsuLoginBll usuarioLog = new UsuLoginBll();
        UsuLoginModel usuario = usuarioLog.findName(usuarioTela.getNome());
        System.out.println(usuario);
        if (usuario.getId() > 0 && usuario.getNome().equalsIgnoreCase(usuarioTela.getNome()) && usuario.getSenha().equalsIgnoreCase(usuarioTela.getSenha())) {
            return true;
        } else {
            return false;
        }
    }
}
