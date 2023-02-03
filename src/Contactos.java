public class Contactos  {
    private String name;
    private String phoneNumber;

    public Contactos (String nombre , String numero){
        name=nombre;
        phoneNumber=numero;
    }

    public String getName (){
        return name;
    }

    public String getPhoneNumber (){
        return phoneNumber;
    }

    public static Contactos createContact (String Name , String PhoneNumber ){
    return new Contactos(Name , PhoneNumber);

    }

}
