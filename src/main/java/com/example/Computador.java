package com.example;

public class Computador extends Jogador {
    
    @Override
    public boolean parou(){
        if (getPontos() > 16) {
            parar();
        }
        return super.parou();
    }
}
