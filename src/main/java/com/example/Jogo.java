package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador) {
        if (jogador.parou() == true) {
            return null;
        }
        Carta cartaVirada = monte.virar();
        jogador.receberCarta(cartaVirada);
        return cartaVirada;
    }

    public boolean acabou() {
        if ((jogador.parou() == true && computador.parou() == true)
                || (jogador.getPontos() >= 21 || computador.getPontos() >= 21)) {
            return true;
        }
        return false;
    }

    public String resultado() {
        if (jogador.getPontos() == computador.getPontos()
                || (jogador.getPontos() > 21 && computador.getPontos() > 21)) {
            return "Empate!";
        } else if (jogador.getPontos() > computador.getPontos() && jogador.getPontos() <= 21) {
            return "Você ganhou!";
        } else {
            return "Você perdeu!";
        }
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Computador getComputador() {
        return computador;
    }

}