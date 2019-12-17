package lab10;

abstract class Odejda implements ITkani{
    public int lenght;
    public double height;
    public int price;

    public Odejda() {}

    public Odejda(int lenght, double height, int price) {
        this.lenght = lenght;
        this.height = height;
        this.price = price;
    }

    @Override
    public double area() {
        return this.height * this.lenght;
    }

    @Override
    public double totalPrice() {
        return area() * price;
    }

    @Override
    public abstract double totalLength();
}
