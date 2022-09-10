public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "Deyby",
                25,
                "+57 315-881-28-88",
                "Activo"
        );
        Trabajador trabajador = new Trabajador(
                "Alex",
                28,
                "+57 310-876-56-82",
                1200000
        );

        System.out.println("Cliente");
        System.out.println(
                "Nombre:"+cliente.nombre+
                ", Edad:"+cliente.edad+"" +
                ", Telefono:"+cliente.telefono+"" +
                ", Credito:"+cliente.credito
        );
        System.out.println("Trabajador");
        System.out.println(
                "Nombre:"+trabajador.nombre+
                ", Edad:"+trabajador.edad+
                ", Telefono:"+trabajador.telefono+
                ", Salario:"+trabajador.salario+"COP"
        );


    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    String credito;
    public Cliente(String nombre,int edad,String telefono,String credito){
        this.edad=edad;
        this.nombre=nombre;
        this.telefono=telefono;
        this.credito=credito;
    }
}

class Trabajador  extends Persona{
    int salario;
    public Trabajador(String nombre,int edad,String telefono,int salario){
        this.edad=edad;
        this.nombre=nombre;
        this.telefono=telefono;
        this.salario=salario;
    }
}