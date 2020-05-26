package collections3;

public class SquareRootMain {
    public static void main(String[] args) {
        SquareRootFuncIntf squareRootFuncIntf = n -> Math.sqrt(n);
        System.out.println(squareRootFuncIntf.findSquareRoot(4));
    }
}
