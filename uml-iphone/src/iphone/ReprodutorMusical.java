package iphone;

public class ReprodutorMusical {
    private String musica;

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void tocar(){
        System.out.println("Tocando a musica: "+ getMusica());
    }
    public void pausar(){
        System.out.println("Pausando a musica: "+ getMusica());
    }
    public void selecionarMusica(String musica){
        setMusica(musica);
        System.out.println("Musica encontrada: "+ getMusica());
    }
}
