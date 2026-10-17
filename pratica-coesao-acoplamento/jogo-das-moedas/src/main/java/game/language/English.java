package game.language;

import game.ui.IRenderer;

public class English implements ILanguage {

    @Override
    public void printWelcome(IRenderer renderer, String deviceName) {
        renderer.showMessage("=== Collect the coins ($) - control: " + deviceName + " ===");
    }

    @Override
    public void printUnknownCommand(IRenderer renderer) {
        renderer.showMessage("Unknown command.");
    }

    @Override
    public void printWall(IRenderer renderer) {
        renderer.showMessage("Wall! You cannot go there.");
    }

    @Override
    public void printLevelComplete(IRenderer renderer) {
        renderer.showMessage("You collected all coins!");
    }

    @Override
    public void printCoinCollected(IRenderer renderer, int score) {
        renderer.showMessage("Coin collected! Score: " + score);
    }

    @Override
    public void printFinalScore(IRenderer renderer, int score) {
        renderer.showMessage("Final score: " + score);
    }

    @Override
    public void printGameOver(IRenderer renderer, int score) {
        renderer.showMessage("GAME OVER - Score: " + score);
    }

    @Override
    public String scoreLabel(int score) {
        return "Score: " + score;
    }

    @Override
    public String commandPrompt() {
        return "Command (w/a/s/d, q to quit): ";
    }

    @Override
    public String windowTitle() {
        return "Coin Game";
    }

    // ===== Textos dos dispositivos de entrada =====

    @Override
    public String keyboardName() {
        return "Keyboard";
    }

    @Override
    public String buttonsName() {
        return "Buttons";
    }

    @Override
    public String joystickName() {
        return "Virtual Joystick (mouse)";
    }

    @Override
    public String buttonsWindowTitle() {
        return "Controls";
    }

    @Override
    public String joystickWindowTitle() {
        return "Virtual Joystick";
    }

    @Override
    public String upLabel() {
        return "Up";
    }

    @Override
    public String downLabel() {
        return "Down";
    }

    @Override
    public String leftLabel() {
        return "Left";
    }

    @Override
    public String rightLabel() {
        return "Right";
    }

    @Override
    public String exitLabel() {
        return "Quit";
    }
}