class Game {
    void type() {
        System.out.println("Indoor & outdoor games");
    }
}

class Cricket extends Game {
    @Override
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game {
    @Override
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

public class Gaming {
    public static void main(String[] args) {
        Game game;

        game = new Game();
        game.type();

        game = new Cricket();
        game.type();

        game = new Chess();
        game.type();
    }
}
