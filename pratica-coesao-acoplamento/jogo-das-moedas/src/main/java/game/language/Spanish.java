package game.language;

import game.ui.IRenderer;

public class Spanish implements ILanguage {

    @Override
    public void printWelcome(IRenderer renderer, String deviceName) {
        renderer.showMessage("=== Recoge las monedas ($) - control: " + deviceName + " ===");
    }

    @Override
    public void printUnknownCommand(IRenderer renderer) {
        renderer.showMessage("Comando desconocido.");
    }

    @Override
    public void printWall(IRenderer renderer) {
        renderer.showMessage("¡Pared! No puedes ir por ahí.");
    }

    @Override
    public void printLevelComplete(IRenderer renderer) {
        renderer.showMessage("¡Recogiste todas las monedas!");
    }

    @Override
    public void printCoinCollected(IRenderer renderer, int score) {
        renderer.showMessage("¡Moneda recogida! Puntuación: " + score);
    }

    @Override
    public void printFinalScore(IRenderer renderer, int score) {
        renderer.showMessage("Puntuación final: " + score);
    }

    @Override
    public void printGameOver(IRenderer renderer, int score) {
        renderer.showMessage("FIN DEL JUEGO - Puntuación: " + score);
    }

    @Override
    public String scoreLabel(int score) {
        return "Puntuación: " + score;
    }

    @Override
    public String commandPrompt() {
        return "Comando (w/a/s/d, q para salir): ";
    }

    @Override
    public String windowTitle() {
        return "Juego de las Monedas";
    }


    @Override
    public String keyboardName() {
        return "Teclado";
    }

    @Override
    public String buttonsName() {
        return "Botones";
    }

    @Override
    public String joystickName() {
        return "Joystick Virtual (ratón)";
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
        return "Arriba";
    }

    @Override
    public String downLabel() {
        return "Abajo";
    }

    @Override
    public String leftLabel() {
        return "Izquierda";
    }

    @Override
    public String rightLabel() {
        return "Derecha";
    }

    @Override
    public String exitLabel() {
        return "Salir";
    }
}