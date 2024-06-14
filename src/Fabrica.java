public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("APLICATIVO TELEFONE INICIADO");{
            iphone.ligar();
            iphone.atender();
            iphone.iniciarCorreioVoz();
        }
        System.out.println("-----------------------------");

        System.out.println("NAVEGADOR WEB INICIADO");{
            iphone.adicionaNovaAba();
            iphone.atualizaPagina();
            iphone.exibirPagina(null);
        }
        System.out.println("-------------------------------");

        System.err.println("SISTEMA DE MUSICA INICIADO");{
            iphone.selecionarMusica();
            iphone.tocar();
            iphone.pausar();
        }
        System.out.println("--------------------------------");
    }
}