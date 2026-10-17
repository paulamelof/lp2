package game.language;

import game.ui.IRenderer;

public interface ILanguage {
    void printWelcome(IRenderer renderer, String deviceName);
    void printUnknownCommand(IRenderer renderer);
    void printWall(IRenderer renderer);
    void printLevelComplete(IRenderer renderer);
    void printCoinCollected(IRenderer renderer, int score);
    void printFinalScore(IRenderer renderer, int score);
    void printGameOver(IRenderer renderer, int score);
    String scoreLabel(int score);
    String commandPrompt();
    String windowTitle();

    String keyboardName();
    String buttonsName();
    String joystickName();
    String buttonsWindowTitle();
    String joystickWindowTitle();
    String upLabel();
    String downLabel();
    String leftLabel();
    String rightLabel();
    String exitLabel();
}