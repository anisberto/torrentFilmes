package br.com.torrent.bll;

import br.com.torrent.dal.UsuLoginDal;
import br.com.torrent.model.UsuLoginModel;
import java.util.List;

public class UsuLoginBll {

    private UsuLoginDal usuarioConect;

    public UsuLoginBll() throws Exception {
        usuarioConect = new UsuLoginDal();
    }

    public void adicionarFilmes(UsuLoginModel usuario) throws Exception {
        usuarioConect.adicionarUsuario(usuario);
    }

    public void removerFilmes(UsuLoginModel usuario) throws Exception {
        usuarioConect.deleteUsuario(usuario.getId());
    }

    public void alterarFilmes(UsuLoginModel usu) throws Exception {
        usuarioConect.updateUsuario(usu);
    }

    public List<UsuLoginModel> consultarFilmes() throws Exception {
        return usuarioConect.getAllUsuario();
    }

    public UsuLoginModel consultarFilmesPorId(int id) throws Exception {
        return usuarioConect.getUsuarioById(id);
    }

    public UsuLoginModel findName(String nome) {
        return usuarioConect.findName(nome);
    }
}
