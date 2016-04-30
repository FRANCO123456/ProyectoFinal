package com.example.android.verdadoreto;

/**
 * Created by franco on 18/04/2016.
 */
public class Preguntas {
    String preguntas [];
    public Preguntas(){
        preguntas = new String[15];
        this.llenar();

    }
    public void llenar(){
        preguntas [0]="¿Cuantos animales tienes?";
        preguntas[1]="¿Tienes novio o novia?";
        preguntas[2]="¿te gusta alguien y como se llama ?";
        preguntas[3]="¿Dónde planeas ir en tu luna de miel?";
        preguntas[4]="¿Que super poder te gustaria tener?";
        preguntas[5]="¿Cual es el Sueño de tu Vida?";
        preguntas[6]="Tuviste un amigo imaginario cuando eras pequeño?";
        preguntas[7]="¿Cual es tu deporte favorito?";
        preguntas[8]="¿Cual es tu Hobby Favorito?";
        preguntas[9]="¿Eres timido o extrovertido?";
        preguntas[10]="¿que mes naciste? ";
        preguntas[11]="Que edad tienes";
        preguntas[12]="Que super heroe te gustaria ser";
        preguntas[13]="¿Que es la mas Atrevido que hiciste?";
        preguntas[14]="¿Que te Gusta mas de tu vida?";
    }
    public String res(int a){
        return preguntas[a];
    }

}
