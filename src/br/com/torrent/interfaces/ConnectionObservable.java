package br.com.torrent.interfaces;

public interface ConnectionObservable {

    void addConnectionObserver(ConnectionObserver connectionObserver);
    void removeConnectionObserver(ConnectionObserver connectionObserver);
    void notifyObservers();
}
