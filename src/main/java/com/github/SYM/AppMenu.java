package com.github.SYM;

import java.util.Scanner;

public class AppMenu {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int option= 9;

        UnoGame manager=new UnoGame(sc);
        do{

            AppMenu.displayMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 0: 
                    break;
                case 1:
                    manager.startGame();    
                    break;
                
                case 2:
                    manager.displayStatisticsPerPlayer();
                    break;
                case 3: 
                    manager.displayStatisticsPerGame();
                    break;
                case 4:
                    manager.addPlayer();
                    break;
                default: 
                    System.out.println("Escoja una opcion valida");
                

            }


        }while(option!=0);
    
    
    }

    public static void displayMenu() {
        
        System.out.println("Escoja una opcion");
        System.out.println("( 0 ) Salir");
        System.out.println("( 1 ) Empezar juego");
        System.out.println("( 2 ) Mostrar estadisticas de los jugadores");
        System.out.println("( 3 ) Mostrar estadisticas de los juegos");
        System.out.println("( 4 ) Agregar jugadores");


    
    
    
    
    }
}