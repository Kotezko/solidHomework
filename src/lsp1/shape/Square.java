package lsp1.shape;

public class Square extends Quadroliteral {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSideA(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
