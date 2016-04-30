package com.example.android.verdadoreto;

/**
 * Created by franco on 18/04/2016.
 */
public class reto {
    String retos [];
    public reto (){
        retos = new String[15];
        this.llenar();

    }
    public void llenar(){
        retos [0]="Canta La Gallina Turuleka Para todos los presentes ";
        retos[1]="Camina Descalzo sobre un camino de legos";
        retos[2]="Sube un video a Facebook  ";
        retos[3]="Para Un Taxi y Pidele la hora";
        retos[4]="Canta Baby de Justin Bieber lo Mas fuerte que puedas";
        retos[5]="Habla por 3 minutos sin parar";
        retos[6]="Actua como un gorila un minuto";
        retos[7]="Canta Tu cancion favorita";
        retos[8]="Cuentanos una broma";
        retos[9]="Haz 20 lagartijas";
        retos[10]="Haz el Baile del Robot ";
        retos[11]="Actua Como Un Pollo por 1 minuto! CACAREANDO Y TODO";
        retos[12]="Tirate al piso y as como la cucaracha";
        retos[13]="dale un abrazo al primero que veas";
        retos[14]="Imita a un animal y que los demas adivinen que animal es";

    }
    public String res(int a){
        return retos[a];
    }

}
