package iphone;

public class AparelhoTelefonico {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public  void ligar(String numero){
        setNumero(numero);
        System.out.println("Ligando para o número: "+ getNumero());
    }
    public void atender(){
        System.out.println("Atendendo a ligação do número: "+ getNumero());
    }
    public void iniciarCorreioVoz(){
        System.out.println("Você está no correio de voz, o número: "+ getNumero() + " lhe deixou mensagem");
    }
}
