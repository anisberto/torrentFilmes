package br.com.torrent.bll;

import br.com.torrent.model.UsuarioModel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidacoesUsuarioBll {

    public static boolean validarCamposUsuarios(UsuarioModel usuario) {
//        return !usuario.getNome().isEmpty() && usuario.getCpf().isEmpty() && usuario.getEmail().isEmpty() && usuario.getSenha().isEmpty();
        return !usuario.getNome().isEmpty();

    }

    public static boolean validaAcessoUser(UsuarioModel user) {
        UsuarioBll bllSearch = null;
        try {
            bllSearch = new UsuarioBll();
        } catch (Exception ex) {
            Logger.getLogger(ValidacoesUsuarioBll.class.getName()).log(Level.SEVERE, null, ex);
        }
        UsuarioModel userTeste = bllSearch.findUsuarioName(user.getNome());
        if (!user.getNome().isEmpty() && user.getIden() > 0 && userTeste != null) {
            return user.getSenha().equalsIgnoreCase(userTeste.getSenha());
        } else {
            return false;
        }
    }
}
