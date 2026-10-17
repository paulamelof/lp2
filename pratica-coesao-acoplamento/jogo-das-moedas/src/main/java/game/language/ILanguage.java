package game.language;

import game.ui.IRenderer;

/**
 * O CONTRATO DO IDIOMA.
 *
 * Quem imprime nao conhece a frase: chama um metodo, e quem conhece
 * a frase e o objeto do idioma. Quando a mensagem tem um dado dentro
 * (como o score), o metodo recebe esse dado como parametro.
 */
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
}