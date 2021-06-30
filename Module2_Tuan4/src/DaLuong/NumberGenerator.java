package DaLuong;

public class NumberGenerator implements Runnable{
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for ( int i = 0 ; i <= 10 ; i++ ) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator("Nam");
        Thread thread = new Thread(numberGenerator);
        thread.setPriority(Thread.MAX_PRIORITY);

        NumberGenerator numberGenerator1 = new NumberGenerator("Hiền");
        Thread thread1 = new Thread(numberGenerator1);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        thread1.start();

    }
}
