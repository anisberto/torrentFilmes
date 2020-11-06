package br.com.torrent.bll;
import br.com.torrent.model.UsuarioModel;

public class ValidacoesUsuarioBll {

    public static boolean validarCamposUsuarios(UsuarioModel usuario) {
//        return !usuario.getNome().isEmpty() && usuario.getCpf().isEmpty() && usuario.getEmail().isEmpty() && usuario.getSenha().isEmpty();
        return !usuario.getNome().isEmpty();

    }
}
