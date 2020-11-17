package br.com.torrent.bll;

import br.com.torrent.dal.UsuarioDal;
import br.com.torrent.interfaces.UsuarioInterface;
import br.com.torrent.model.UsuarioModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioBll implements UsuarioInterface {

    UsuarioInterface novoUsuario;
    ValidacoesBll valida;
    //private UsuarioDal usuarioDao;

    public UsuarioBll() throws Exception {
        novoUsuario = new UsuarioDal();
        valida = new ValidacoesBll();
    }

    @Override
    public void adicionarUsuario(UsuarioModel usuario) {
        
        if (valida.isCPF(usuario.getCpf())) {
            novoUsuario.adicionarUsuario(usuario);

        } else {
            JOptionPane.showMessageDialog(null, "CPF Inválido !!!");
        }

    }

    @Override
    public void deleteUsuario(int usuario) {
        try {
            novoUsuario.deleteUsuario(usuario);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());

            } catch (Exception ex) {
                Logger.getLogger(UsuarioBll.class
                        .getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(UsuarioBll.class
                        .getName()).log(Level.SEVERE, null, ex);

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
                Logger.getLogger(UsuarioBll.class
                        .getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(UsuarioBll.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public UsuarioModel findUsuarioName(String nome) {
        try {
            return novoUsuario.findUsuarioName(nome);
        } catch (Exception e) {
            return null;
        }
    }
}
