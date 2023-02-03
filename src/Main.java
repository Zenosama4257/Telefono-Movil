import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public  static void Menu () {
        System.out.println("0 - Para salir");
        System.out.println("1 - Para imprimir contactos");
        System.out.println("2 - Para añadir");
        System.out.println("3 - Para modificar");
        System.out.println("4 - Para eliminar");
        System.out.println("5 - Para buscar un contacto");
        System.out.println("6 - Para imprimir el menu");
    }


    /*
    public static void printContacts () {

    }

     */

    public static void AnyadirContacto (TelefonoMovil Javi ){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String nombre;
        String telefono;
        System.out.println("Dime el nombre");
        nombre=sc.nextLine();
        System.out.println("Dime el número de telefono");
        telefono = sc2.nextLine();
       //Contactos o = new Contactos(nombre , telefono);
        if (Javi.addNewContact(Contactos.createContact(nombre , telefono))){
            System.out.println("El contacto ha sido añadido correctamente");
        }
        else {
            System.out.println("Ya existe un contacto en la agenda con esos datos, los contactos no se pueden duplicar");
        }
    }

    public static void removeContact (TelefonoMovil Javi) {
        Scanner sc8 = new Scanner( System.in);
        String nombre;
        System.out.println("Dime el nombre del contacto");
        nombre = sc8.nextLine();
        if (Javi.removeContact(Javi.querryContact(nombre)  ) ){
            System.out.println("El cntacto ha sido eliminado ");
        }
        else {
            System.out.println("El contacto no existe");
        }
    }

    public static void encontrarContacto (TelefonoMovil Javi){
        Scanner sc9 = new Scanner(System.in);
        System.out.println("Dime el nombre del Contacto que quieres encontrar");
        String Nombre = sc9.nextLine();
            if ( Javi.querryContact(Nombre) != null) {
                System.out.println(" El nombre del contacto es " + Javi.querryContact(Nombre).getName() + " el telefono del contacto es  " + Javi.querryContact(Nombre).getPhoneNumber());
            }
            else {
                System.out.println("El contacto no existe");
            }
    }

    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
         String Telefono_Mio = "657350353";
         TelefonoMovil Javier = new TelefonoMovil(Telefono_Mio);
        int opcion;
        boolean continuar=true;

        Menu();

        do{
            System.out.println("Elige una opción: ");
            opcion = sc3.nextInt();


            switch (opcion) {
                case 0:
                    continuar = false;
                    break;

                case 1:
                   Javier.printContacts();
                    break;
                case 2:
                    AnyadirContacto(Javier);
                    break;
                case 3:
                    Scanner sc5= new Scanner(System.in);
                    Scanner sc6= new Scanner(System.in);
                    Scanner sc7= new Scanner(System.in);

                    Contactos Modificacion;

                    String nueNombre;
                    String nueNumero;
                    System.out.println("Dime el nombre del contacto que quieres modificar");
                    String op = sc5.nextLine();
                    System.out.println("Dime el nuevo Nombre");
                    nueNombre = sc6.nextLine();
                    System.out.println("Dime el nuevo número");
                    nueNumero = sc7.nextLine();
                        Modificacion = new Contactos(nueNombre , nueNumero);

                    if (Javier.updateContact(Javier.querryContact(op) , Modificacion)){
                        System.out.println("Se ha actualizado Correctamente");
                    }
                    else {
                        System.out.println("No se ha actualizado ");
                    }


                    break;
                case 4:
                    removeContact(Javier);
                    break;
                case 5:
                    encontrarContacto(Javier);
                    break;

                case 6:
                    Menu();
                    break;
            }
        }while(continuar);
    }


/*
        AnyadirContacto(Javier);
        AnyadirContacto(Javier);
        Javier.printContacts();

 */
    }
