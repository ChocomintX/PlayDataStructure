package chapter06;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] arr = {5, 3, 6, 8, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            bst.add(arr[i]);
        }
//        System.out.println(bst.toString());
        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        bst.postOrder();
    }

}
