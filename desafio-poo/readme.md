// Interface ReprodutorMusical
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface AparelhoTelefonico
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface NavegadorInternet
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone implementando todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando funcionalidades
        iphone.tocar();
        iphone.selecionarMusica("Imagine");
        iphone.pausar();
        
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
