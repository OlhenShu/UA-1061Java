package work6;

public class Eagle extends FlyingBird {
    public  Eagle() {
        super(true, true);
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(false, true);
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(true, true);
    }
}
