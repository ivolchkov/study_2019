package lesson2.emuns;

public enum Color {
    YELLOW("yellow"),
    GREEN("green",1){
        @Override
        public void method() {
            System.out.println("2");
        }
    };

    private String name;
    private int code;

    private Color(String name) {
        this.name = name;
    }

    Color(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void method(){
        System.out.println("1");
    }
}
