package br.com.torrent.bll;

import br.com.torrent.dal.UsuLoginDal;
import br.com.torrent.model.UsuLoginModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsuLoginBll {

    private UsuLoginDal usuarioConect;

    public UsuLoginBll() throws Exception {
        usuarioConect = new UsuLoginDal();
    }

    public void adicionarUsuLogin(UsuLoginModel usuario) throws Exception {
        usuarioConect.adicionarUsuario(usuario);
    }

    public void removerUsuLogin(UsuLoginModel usuario) throws Exception {
        usuarioConect.deleteUsuario(usuario.getId());
    }

    public void alterarUsuLogin(UsuLoginModel usu) throws Exception {
        usuarioConect.updateUsuario(usu);
    }

    public ArrayList<UsuLoginModel> consultarUsuLogin() throws Exception {
        return (ArrayList<UsuLoginModel>) usuarioConect.getAllUsuario();
    }

    public UsuLoginModel consultarUsuLoginPorId(int id) throws Exception {
        return usuarioConect.getUsuarioById(id);
    }

    public UsuLoginModel findUsuLoginName(String nome) {
        return usuarioConect.findName(nome);
    }
}
