public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Ronald");
        p1.setEdad(24);
        p1.setTelefono(12345);
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Edad: "+p1.getEdad());
        System.out.println("Telefono: "+p1.getTelefono());
    }
}
