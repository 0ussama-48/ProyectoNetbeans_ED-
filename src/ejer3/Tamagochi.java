/*
Vamos a crear la clase Tamagotchi para simular el clásico juego.

Tamagotchi

nombre

cantidadVida

maxVida

Tamagotchi(String nombre, int maxVida)

Constructor que inicializará los valores. CantidadVida se inicializará a cero

juega()

Sólo puede jugar si cantidadVida>=1, esta acción restará 1 de cantidadVida.  Devuelve una cadena que indica:   nombreTamagotchi está jugando y tiene xxx vidas. Si no tiene vida, indicará que no puede jugar

 

come()

Sólo puede comer si cantidadVida<maxVida, esta acción sumará 1 de cantidadVida.  Devuelve una cadena que indica:   nombreTamagotchi está comiendo y tiene xxx vidas, o que tiene la máxima cantidad de vida y no puede comer.

 

muestraVida() 

Devuelve una cadena indicando el nombre y la cantidad de vida que le queda.

Desde el método principal de la clase Ejer3 mostraremos el siguiente menú y realizaremos las acciones oportunas:

1.Crea tamagotchi

2.Juega con tu mascota virtual

3.Da de comer a tu mascota virtual

4.Ver la vida de tu mascota

5.Fin
 */
package ejercicio3;

/**
 *
 * @author mateo
 */
public class Tamagochi {
       private String nombre;
    private int cantidadVida;
    private int maxVida;
   /**
    * 
    * @param nombreTamagochi
    * @param vida 
    */
     public Tamagochi(String nombreTamagochi, int vida) {
        this.nombre = nombreTamagochi;// variable de la clase
        this.maxVida = vida;
        this.cantidadVida = 0;

    }
   /**
    * 
    * @param nombreAlumno
    * @param vida
    * @param vidaMaxima 
    */
      public Tamagochi(String nombreAlumno, int vida, int vidaMaxima) {
        this.nombre = nombreAlumno;// variable de la clase
        this.cantidadVida = vida;
        this.maxVida = vidaMaxima;

    }
      
      
      
      
      
      /**
       * 
       * @return Los datos del alumno (nombre/edad/nota)
       */
      
      
      
      public String juega(){
          
          if (cantidadVida >= 1) {
              cantidadVida--;
              return nombre + " esta jugando y tiene " + cantidadVida + " de vida. ";
          }else {
              return nombre + " no puede jugar.";
          
          }

      }
        public String come(){
          
          if (cantidadVida<maxVida) {
              cantidadVida++;
              return nombre + " esta comiendo y tiene " + cantidadVida + " de vida. ";
          }else {
              return nombre + " tiene " + maxVida+ " no puede comer.";
          
          }

      }
        
         public String muestraVida(){
        return nombre + " tiene " + cantidadVida + " vidas. ";
      
      }
      
   
}
