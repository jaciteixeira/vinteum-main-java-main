package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    private String[] numeros = {"", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public Carta(int numero, Naipe naipe) {
        this.naipe = naipe;
        this.numero = numero;
    }

    public String imagePath() {

        // if (numero == 1) {
        //     return "classic-cards/Ace" + naipe + ".png";
        // } else if (numero == 11) {
        //     return "classic-cards/Jack" + naipe + ".png";
        // } else if (numero == 12) {
        //     return "classic-cards/Queen" + naipe + ".png";
        // } else if (numero == 13) {
        //     return "classic-cards/King" + naipe + ".png";
        // } else {
        //     return "classic-cards/" + numero + naipe + ".png";
        // }

        return "classc-cards/" + numeros[numero] + naipe +".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

}
