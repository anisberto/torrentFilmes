package br.com.torrent.interfaces;

public interface ConnectionObserver {
    void onConnectionChange(boolean isConnectionOk);
}
