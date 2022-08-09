public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Ronald";
        cliente.edad = 26;
        cliente.telefono = 787654678;
        cliente.credito = 300.00;
        System.out.println("Me llamo " + cliente.nombre + ", tengo " + cliente.edad + " años y mi numero es " + cliente.telefono
                + " mi credito es de " + cliente.credito );

        trabajador.nombre = "Nicolas";
        trabajador.edad = 30;
        trabajador.telefono = 456788762;
        trabajador.salario = 1200.00;
        System.out.println("Me llamo " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi numero es " + trabajador.telefono
                + " mi salario es de " + trabajador.salario);

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}