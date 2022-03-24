package util;

public class Reuso {
    /*  public - Determina a visibilidade do metódo(Visível em todo o projeto (projeto002))
        static - Que o metodo pode ser usado sem instanciar um objeto, é um metodo de classe
        void - significa que este metódo não tem retorno
        print - nome que definimos para o metodo
        String msg - que o metodo espera uma String como parametro */
    public static void print(Object msg) { // Declarar a variável como Object, da a liberdade para o paramêtro ser de diferentes tipos.
        System.out.println(msg);
    }
}
