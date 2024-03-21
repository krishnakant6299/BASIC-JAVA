class Thiskeyword {
    int i;

    void setvalue(int x) {
        i = x;
    }

    void show() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Thiskeyword t = new Thiskeyword();
        t.setvalue(10);
        t.show();
    }
}
