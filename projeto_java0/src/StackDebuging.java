public class StackDebuging {

    // testando métodos e debugging
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    static void a() { // implicitamente public static void (a)
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() { // implicitamente public static void (b)
        System.out.println("Entrou no método b.");
        for (int i = 0; i <= 4; i++)
            System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c() { // implicitamente public static void (c)
        System.out.println("Entrou no método c.");
        // Thread.dumpStack(); // imprime a Stack Trace e é útil para debugging
        System.out.println("Finalizou o método c.");
    }

}