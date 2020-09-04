package pruebatecnicasofka;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        char op;  
        int i=0, j=0, k=0, pesototal=0, total=0, menor=0, mayor=0;
        int bulto[];
	float promedio=0;
	double dolar=0;
        bulto = new int[50];
        Scanner reader = new Scanner (System.in);
	try {
                do{
                    System.out.println("ingrese peso del bulto en kg: ");
                    bulto[i] = reader.nextInt();
                    pesototal=pesototal+bulto[i];
                    if((bulto[i] > 0)&&(bulto[i] <= 25)){
                    total = total + 0; 
                        }else if((bulto[i] >= 26)&&(bulto[i] <= 300)){
                            total = total + bulto[i]*1500;	
                        }else if((bulto[i]>=301)&&(bulto[i]<=500)){
                            total = total + bulto[i]*2500;
                        }else{
                            System.out.println("La capacidad del bulto no puede exceder los 500kg");
                            i = i-1;
                }
                i=i+1;
                System.out.println("Si desea continuar presiona 's' y  para terminar presiona 'n'");
                op = reader.next().charAt(0);
                k=i;
                }while((op == 's')||(op != 'n')||(pesototal > 18000));
                } catch (Exception e) {
            //System.out.println("");
        }
        for(j=0; j<=k; j++){
            mayor = bulto[k];
            menor = bulto[0];
            if(bulto[j]>mayor){
                mayor = bulto[j];
            } 
            if(bulto[j] < menor){
                menor = bulto[j];
            }			
        }
        promedio = pesototal/i;
        dolar = total/3500; 
        System.out.println("*Resumen de carga ingresada al Boing 747*\n");
        System.out.println("El numero total de bultos ingresados es: "+ i + "\n");
        System.out.println("El peso del bulto mas liviano es: " + menor + "\n");
        System.out.println("El peso del bulto mas pesado es: " + mayor + "\n");
        System.out.println("El peso promedio de los bultos es: " + promedio + "\n");
        System.out.println("El ingreso por bultos en pesos es: " + total + "\n");
        System.out.println("El ingreso por bultos en dolares basado en dolar a 3.500cop, es: " + dolar + "\n");
    }     
}
