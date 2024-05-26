package iphone;

public class NavegadorInternet {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void exibirPagina(String url){
        setUrl(url);
        System.out.println("Exibindo página "+ getUrl());
    }
    public void adicionarNovaAba(){
        System.out.println("Uma nova aba foi aberta");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada com sucesso");
    }
}
