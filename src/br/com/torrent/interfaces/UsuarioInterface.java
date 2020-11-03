package br.com.torrent.interfaces;

import br.com.torrent.model.UsuarioModel;

/**
 *
 * @author edivan
 */
public interface UsuarioInterface {

    public void adicionarUsuario(UsuarioModel usuario);

    public void deleteUsuario(UsuarioModel usuario);

    public void updateusuario(UsuarioModel usuario);

}
