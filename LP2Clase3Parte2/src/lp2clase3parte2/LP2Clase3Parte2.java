/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp2clase3parte2;
import java.util.Scanner;
public class LP2Clase3Parte2 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


System.out.println("Ingrese su usuario");
String Usuario = scan.nextLine();

System.out.println("Bienvenido " + Usuario + ", ingrese el momento del dia en que se encuentre");
System.out.println("Atendiendo que: ");
System.out.println("Mañana = 1 ");
System.out.println("Tarde = 2 ");
System.out.println("Noche = 3 ");
int MomentoDia = scan.nextInt();

System.out.println("Ingrese la temperatura actual");
int temperatura = scan.nextInt();

if(MomentoDia==1 && temperatura<20){
    System.out.println("La emperatura del tanque es normal");
}
if(MomentoDia==1 && temperatura>20){
    System.out.println("PELIGRO, Temperatura elevada");
}

if(MomentoDia==2 && temperatura<30){
    System.out.println("La emperatura del tanque es normal");
}
if(MomentoDia==2 && temperatura>30){
    System.out.println("PELIGRO, Temperatura elevada");
}

if(MomentoDia==3 && temperatura<10){
    System.out.println("La emperatura del tanque es normal");
}
if(MomentoDia==3 && temperatura>10){
    System.out.println("PELIGRO, Temperatura elevada");
}

}}
