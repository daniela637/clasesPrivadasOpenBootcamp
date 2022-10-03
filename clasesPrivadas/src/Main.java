public class Main {
    public static void main(String[] args) {

        //instancio el objeto
        Persona person =new Persona();

        //le seteo valores al objeto
        person.setNombre("Daniela");
        person.setEdad(23);
        person.setTelefono("1192345690");

        //imprimo el objeto
        String persona= person.toString();
        System.out.println(persona);

    }
}