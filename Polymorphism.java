class shapes {
  public void render() {
    System.out.println("square...");
  }
}

class circle extends square{
  public void render() {
    System.out.println("circle...");
  }
}

class triangle extends shapes {
  public void render() {
    System.out.println("triangle...");
  }
}

class Main {
  public static void main(String[] args) {
    Square s1 = new Square();
    s1.render();

    Circle c1 = new Circle();
    c1.render();
  }
}
