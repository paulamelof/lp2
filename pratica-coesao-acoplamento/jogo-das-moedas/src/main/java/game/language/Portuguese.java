package game.language;

import game.ui.IRenderer;

public class Portuguese implements ILanguage {

    @Override
    public void printWelcome(IRenderer renderer, String deviceName) {
        renderer.showMessage("=== Colete as moedas ($) - controle: " + deviceName + " ===");
    }

    @Override
    public void printUnknownCommand(IRenderer renderer) {
        renderer.showMessage("Comando desconhecido.");
    }

    @Override
    public void printWall(IRenderer renderer) {
        renderer.showMessage("Parede! Você não pode ir por aí.");
    }

    @Override
    public void printLevelComplete(IRenderer renderer) {
        renderer.showMessage("Você coletou todas as moedas!");
    }

    @Override
    public void printCoinCollected(IRenderer renderer, int score) {
        renderer.showMessage("Moeda coletada! Pontuação: " + score);
    }

    @Override
    public void printFinalScore(IRenderer renderer, int score) {
        renderer.showMessage("Pontuação final: " + score);
    }

    @Override
    public void printGameOver(IRenderer renderer, int score) {
        renderer.showMessage("FIM DE JOGO - Pontuação: " + score);
    }

    @Override
    public String scoreLabel(int score) {
        return "Pontuação: " + score;
    }

    @Override
    public String commandPrompt() {
        return "Comando (w/a/s/d, q para sair): ";
    }

    @Override
    public String windowTitle() {
        return "Jogo das Moedas";
    }

    @Override
    public String keyboardName() {
        return "Teclado";
    }

    @Override
    public String buttonsName() {
        return "Botões";
    }

    @Override
    public String joystickName() {
        return "Joystick Virtual (mouse)";
    }

    @Override
    public String buttonsWindowTitle() {
        return "Controles";
    }

    @Override
    public String joystickWindowTitle() {
        return "Joystick Virtual";
    }

    @Override
    public String upLabel() {
        return "Cima";
    }

    @Override
    public String downLabel() {
        return "Baixo";
    }

    @Override
    public String leftLabel() {
        return "Esquerda";
    }

    @Override
    public String rightLabel() {
        return "Direita";
    }

    @Override
    public String exitLabel() {
        return "Sair";
    }
}