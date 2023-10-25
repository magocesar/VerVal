package menus;

import java.util.Scanner;

import Proj_Princ.*;

public class menu {
    
    public void exibirMenu(){
        String opcao = null;
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        MusicLibrary musicLibrary = new MusicLibrary();
        
        while(!sair){
            System.out.println("\n--------------------");
            System.out.println("***Biblioteca de músicas***");
            System.out.println("1 - Cadastrar música");
            System.out.println("2 - Buscar música");
            System.out.println("3 - Excluir música");
            System.out.println("--------------------");
            System.out.println("Para sair do programa, digite '0'");
            System.out.println("--------------------"); 

            boolean opcaoValida = false;

            while(!opcaoValida){
                try{
                    System.out.print("Digite a opção desejada: ");
                    opcao = scanner.nextLine();
                    opcaoValida = true;
                }catch(Exception e){
                    System.out.println("Opção inválida!");
                }
            }

            int id = -1;

            switch (opcao) {
                case "1" :
                    System.out.println("--------------------");
                    System.out.println("Cadastrar música");
                    System.out.println("--------------------");
                    System.out.print("Digite o id da música: ");
                    id = scanner.nextInt();
                    System.out.print("Digite o titulo da música: ");
                    String title = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Digite o nome do artista: ");
                    String artist = scanner.nextLine();
                    System.out.print("Digite o nome do álbum: ");
                    String album = scanner.nextLine();
                    System.out.print("Digite a duração da música: ");
                    String length_time = scanner.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("--------------------");
                    System.out.println("Música cadastrada com sucesso!");
                    System.out.println("--------------------");
                    System.out.println("Retornando ao menu principal");

                    Song song = new Song( id, title, artist, album, length_time, year);

                    musicLibrary.addSong(song);
                    break;
                
                case "2" :
                    System.out.println("--------------------");
                    System.out.println("Buscar música");
                    System.out.println("--------------------");
                    System.out.print("Digite o id da música: ");
                    id = scanner.nextInt();
                    System.out.println("--------------------");
                    if (musicLibrary.searchSong(id)==null){
                        System.out.println("Música não encontrada!");
                        scanner.nextLine();
                        break;
                    }
                    else
                        musicLibrary.searchSong(id).exibirInfo();;
                        scanner.nextLine();
                        break;

                case "3" :
                    System.out.println("--------------------");
                    System.out.println("Excluir música");
                    System.out.println("--------------------");
                    System.out.print("Digite o id da música: ");
                    id = scanner.nextInt();
                    musicLibrary.removeSong(musicLibrary.searchSong(id));
                    System.out.println("--------------------");
                    System.out.println("Música removida com sucesso!");
                    System.out.println("--------------------");
                    System.out.println("Retornando ao menu principal");
                    System.out.println("--------------------");
                    scanner.nextLine();
                    break;

                case "0":
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        
    }
}
