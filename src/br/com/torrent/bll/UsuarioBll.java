package br.com.torrent.bll;

import br.com.torrent.dal.UsuarioDal;
import br.com.torrent.interfaces.UsuarioInterface;
import br.com.torrent.model.UsuarioModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioBll implements UsuarioInterface {

    UsuarioInterface novoUsuario;
    //private UsuarioDal usuarioDao;

    public UsuarioBll() throws Exception {
        novoUsuario = new UsuarioDal();
    }

    @Override
    public void adicionarUsuario(UsuarioModel usuario) {
        try {
            novoUsuario.adicionarUsuario(usuario);
        } catch (Exception e) {
            try {
                throw new Exception("Erro bll incluir" + e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteUsuario(UsuarioModel usuario) {
        try {
            novoUsuario.deleteUsuario(usuario);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void updateUsuario(UsuarioModel usuario) {
        try {
            novoUsuario.updateUsuario(usuario);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioBll.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    @Override
    public ArrayList<UsuarioModel> getAllUsuario() {
        try {
            return novoUsuario.getAllUsuario();
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public UsuarioModel getUsuarioById(int id) {
        try {
            return novoUsuario.getUsuarioById(id);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(UsuarioBll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public UsuarioModel findUsuarioName(String nome) {
        try {
            return novoUsuario.findUsuarioName(nome);
        } catch (Exception e) {
        }
        return null;
    }

}
