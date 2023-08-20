public class practise2 {
    public static void main(String[] args) {
        //樹的高度
        int height = 5;
        printTree(height);

    }

    public static void printTree(int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i -1; j++) {
                System.out.print(" ");
            }



            for (int j = 0; j < 1 + i*2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
