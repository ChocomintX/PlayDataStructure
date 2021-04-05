package chapter06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] arr = {28, 16, 30, 13, 22, 29,42};
        for (int i = 0; i < arr.length; i++) {
            bst.add(arr[i]);
        }
//        System.out.println(bst.toString());
//        bst.preOrder();
//        System.out.println();
//        bst.inOrder();
//        System.out.println();
//        bst.postOrder();
//
//        bst.preOrderNR();

        bst.levelOrder();
        System.out.println();
        System.out.println(bst.removeMin());
        System.out.println();
        bst.levelOrder();


        ArrayList<Integer> NUMS=new ArrayList<>();
        while (!bst.isEmpty())
            NUMS.add(bst.removeMin());
        System.out.println(NUMS);
    }

}
