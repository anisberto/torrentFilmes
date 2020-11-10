package br.com.torrent.interfaces;

import br.com.torrent.model.UsuarioModel;
import java.util.ArrayList;


public interface UsuarioInterface {

    public void adicionarUsuario(UsuarioModel usuario);

    public void deleteUsuario(int usuario);

    public void updateUsuario(UsuarioModel usuario);

    public ArrayList<UsuarioModel> getAllUsuario();

    public UsuarioModel getUsuarioById(int id);

    public UsuarioModel findUsuarioName(String nome);
}
