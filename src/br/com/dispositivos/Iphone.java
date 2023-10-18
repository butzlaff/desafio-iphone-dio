package br.com.dispositivos;

public class Iphone implements Telefone, ReprodutorMusical, Navegador {
  public void ligar() {
    System.out.println("Ligando...");
  }
  public void atender() {
    System.out.println("Atendendo...");
  }
  public void iniciarCorrerioVoz() {
    System.out.println("Iniciando correio de voz...");
  }
  public void tocar() {
    System.out.println("Tocando...");
  }
  public void pausar() {
    System.out.println("Pausando...");
  }
  public void selecionarMusica() {
    System.out.println("Selecionando música...");
  }
  public void exibirPagina() {
    System.out.println("Exibindo página...");
  }
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba...");
  }
  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }
}
