package br.com.torrent.bll;

import br.com.torrent.dal.UsuarioDal;
import br.com.torrent.model.UsuarioModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioBll {

    private UsuarioDal usuarioDao;

    public UsuarioBll(){
        try {
            usuarioDao = new UsuarioDal();
        } catch (Exception ex) {
            Logger.getLogger(UsuarioBll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // 1°
    public void adicionarUsuario(UsuarioModel usuario) throws Exception {
        usuarioDao.adicionarUsuario(usuario);
    }

    // 2°
    public void removerUsuario(UsuarioModel usuario) throws Exception {
        usuarioDao.deleteUsuario(usuario.getIden());
    }

    // 3°
    public void alterarUsuario(UsuarioModel usuario) throws Exception {
        usuarioDao.updateUsuario(usuario);
    }

    // 4° 
    public List<UsuarioModel> consultarUsuario() throws Exception {
        return usuarioDao.getAllUsuario();
    }

    // 5°
    public UsuarioModel consultarUsuarioPorId(int id) throws Exception {
        return usuarioDao.getUsuarioById(id);
    }
        
    public UsuarioModel consultarUsuarioPorNome(String nome) throws Exception {
        return usuarioDao.getUsuarioByNome(nome);
    }
        
}
