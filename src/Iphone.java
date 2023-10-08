public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica(String musicaSelecionada) {
        System.out.println("Música selecionada: "+ musicaSelecionada);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para alguém");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem) {
        System.out.println("Iniciando correio de voz: " + mensagem);
    }

    @Override
    public void exibirPagina(String nome) {
        System.out.println("Exibindo página na internet: "+ nome);
    }

    @Override
    public void adicionarNovaAba(String nome) {
        System.out.println("Adicionando nova aba: "+ nome);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

}
