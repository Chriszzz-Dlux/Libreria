package Libreria;

import java.text.BreakIterator;
import java.util.Scanner;
public class Libreria {
    public static void main(String[] args) throws Exception {
        Scanner entrada= new Scanner(System.in);
        int opcion;
        do {
        System.out.println("**********Menu Principal*********");
        System.out.println("1. Libros");
        System.out.println("2. Autores");
        System.out.println("3 Editoriales");
        System.out.println("4. Salir");
        System.out.println("Escribe el numero de la opcion que deseas realizar :) : ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("*****Menu de Libros*****");
                System.out.println("1. Agregar libro");
                System.out.println("2. Modificar Libro");
                System.out.println("3. Eliminar Libro");
                System.out.println("4. Listar Libros");
                System.out.println("5. Regresar");
                System.out.println("Escribe el numero de la opcion que deseas realizar");
                opcion = entrada.nextInt();
                = entrada.nextInt();
                ch (opc){
                    case 1:
                    System.out.println("Agregando LIbro");
                    Libro libro = new Libro();
                    System.out.println("Ingresa el titulo del Libro");
                    libro.titulo = entrada.next(); //Esto es igual a libro.titulo = entrada.next();
                    libro.setTitulo(entrada.next());
                    System.out.println("Ingresa el autor del Libro");
                    break;
                    case 2:
                    System.out.println("Modificando Libro");
                    break;
                    case 3:
                    System.out.println("Eliminando Libro");
                    break;
                }
                break;

            case 2:
                System.out.println("******Menu de Autores******");
                System.out.println("1. Agregar autor");
                System.out.println("1. Modificar autor");
                System.out.println("1. Eliminar autor");
                System.out.println("4. Listar autores");
                System.out.println("5. Regresar");
                break;

            case 3:
            System.out.println("******Menu de Editoriales******");
            System.out.println("1. Agregar editorial");
            System.out.println("2. Modificar editorial");
            System.out.println("3. Eliminar editorial");
            System.out.println("4. Listar editoriales");
            System.out.println("5. Regresar");
            break;
            
            case 4:
            System.out.println("******Gracias por usar el sistema******");
            break;
        
            default:
            System.out.println("Opcion no valida");
            break;
                
        }
        } while (opcion != 4);
          
}
}