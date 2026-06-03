interface Playable {

    void play();
}

// Guitar class implementing interface
class Guitar implements Playable {

    public void play() {

        System.out.println("Guitar is playing music");
    }
}

// Piano class implementing interface
class Piano implements Playable {

    public void play() {

        System.out.println("Piano is playing music");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Guitar g = new Guitar();

        Piano p = new Piano();

        System.out.println("Guitar Output:");
        g.play();

        System.out.println();

        System.out.println("Piano Output:");
        p.play();
    }
}