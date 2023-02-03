import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contactos> myContacts ;

    public TelefonoMovil (String Numero ) {
        myNumber=Numero;
        myContacts = new ArrayList<Contactos>();
    }
    public boolean addNewContact (Contactos item){
        for (int i = 0; i < myContacts.size() ;i++) {
           // myContacts.get(i).getName().toUpperCase().equals(item.getName().toUpperCase());
            if (myContacts.get(i).getName().equalsIgnoreCase(item.getName())) {
                System.out.println("El contacto ya existe");

                return false;
            }
        }
        myContacts.add(item);
        System.out.println("Contacto agregado");
        return true;
    }
public boolean updateContact (Contactos ContactoAntiguo , Contactos Modificacion ){

        for (int i = 0 ; i < myContacts.size();i++){
            if (myContacts.get(i).equals(ContactoAntiguo)){
                myContacts.set( findContact(ContactoAntiguo) ,  Modificacion);
                return true;
            }

        }


        return false;


}


public boolean removeContact (Contactos o){
if(myContacts.contains(o)){
myContacts.remove(o);
return true;
}
else {
    return false;
}
}

    private int findContact (Contactos o){
        int index = myContacts.indexOf(o);
        if(index >=0){
            return index;
        }
        else {
            return -1;
        }

    }

    private int findContact (String o){

        for (int i = 0 ; i < myContacts.size() ; i++){
            if (myContacts.get(i).getName().equalsIgnoreCase(o)){
                return i;
            }

        }

            return -1;



    }

    public  Contactos querryContact (String o){

        if(findContact(o) != -1 ){

             return myContacts.get(findContact(o));

        }
        else {
            return null;
        }




    }

    public void printContacts (){
        System.out.println("Lista de Contactos:");
        for (int i=0; i<myContacts.size(); i++){
            System.out.println( (i +1)+ "." + myContacts.get(i).getName() + " " + myContacts.get(i).getPhoneNumber());

        }

    }



}
