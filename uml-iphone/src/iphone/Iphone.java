package iphone;
import iphone.ReprodutorMusical;
import iphone.AparelhoTelefonico;
import iphone.NavegadorInternet;

public class Iphone {

    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica("Dio.me");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("99999999");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPagina("Santander");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

    }


}
