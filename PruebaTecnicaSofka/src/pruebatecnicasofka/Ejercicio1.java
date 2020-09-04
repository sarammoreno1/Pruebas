package pruebatecnicasofka;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in); 
    double pasaje, destino, estadia, precio=35, plan;
    String nombre, apellido; 
    System.out.println("Calcule su viaje\n");

      System.out.println("Ingrese su Nombre: ");
      nombre = reader.next();
      System.out.println("\nIngrese su Apellido: ");
      apellido = reader.next();
      System.out.println("\nElija su plan de vuelo: \n");
      System.out.println("****Plan de Vuelo****\n");
      System.out.println("1: Viaje sólo ida: \n");
      System.out.println("2: Viaje ida y vuelta: \n");
      plan = reader.nextDouble();
      if(plan == 1){
        System.out.println("\nIngrese la distancia de su destino en km: \n");
        destino = reader.nextDouble();
        pasaje = destino*precio;
      }else{
        System.out.println("\nIngrese la distancia de su destino en km: \n");
        destino = reader.nextDouble();
        System.out.println("\nIngrese el número de días de su estancia: \n");
        estadia = reader.nextDouble();
        if((estadia >= 7) && (destino>= 1000)){
          pasaje = destino*2*precio-(destino*2*precio*0.3);
        }else{
          pasaje = destino*2*precio;
        }
      }
      System.out.println("****Resumen del viaje: ****\n");
      System.out.println("Nombre: " + nombre+ " " + apellido);
      System.out.println("Distancia: " + destino);
      System.out.println("El total de su viaje es: " + pasaje);
  }
}
