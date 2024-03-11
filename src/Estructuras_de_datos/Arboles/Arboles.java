package Estructuras_de_datos.Arboles;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Arboles {
    private static Scanner sc;
    private static BTree root = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int option = -1;
        boolean isExitRequested = false;
        while (!isExitRequested) {
            do {
                System.out.println("Manager of Tree");
                System.out.println("1.- Show Tree");
                System.out.println("2.- Add Node");
                System.out.println("3.- Search Node");
                System.out.println("4.- Create default tree");
                System.out.println("5.- Remove Node");
                System.out.println("6.- Exit");
                option = sc.nextInt();
            } while (option < 0 || option > 6);

            switch (option) {
                case 1:
                    showTree();
                    break;
                case 2:
                    addNodeTree();
                    break;
                case 3:
                    searchNode();
                    break;
                case 4:
                    createDefaultTree();
                    break;
                case 5:
                    removeNode();
                    break;
                case 6:
                    isExitRequested = true;
                    break;
            }
        }
    }

    private static void removeNode() {
        int number = 0;
        System.out.println("What number do you want to delete?");
        number = sc.nextInt();
        searchNodeTree(number, true);
    }

    private static void createDefaultTree() {
        insertNodeTree(5);
        insertNodeTree(4);
        insertNodeTree(9);
        insertNodeTree(-2);
        insertNodeTree(8);
        insertNodeTree(0);
        insertNodeTree(3);
        insertNodeTree(6);
    }

    private static void searchNode() {
        int number = 0;
        System.out.println("What number do you want to search?");
        number = sc.nextInt();
        searchNodeTree(number, false);
    }

    private static void searchNodeTree(int value, boolean delete) {
        int count = 0;
        BTree aux = root;
        BTree parent = null;
        while (aux != null) {
            if (value == aux.number) {
                break;
            }
            parent = aux;
            if (value < aux.number) {
                aux = aux.left;
            } else {
                aux = aux.right;
            }
            count++;
        }
        if (aux == null) {
            System.out.println("Value not found");
        } else {
            if (!delete) {
                System.out.println("Node found after " + count + " iterations");
            } else {
                if(parent != null){
                    if(parent.left.number == value){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
                System.out.println("Node with value "+value+" and its descendent nodes have been deleted");
            }
        }
    }

    private static void addNodeTree() {
        System.out.println("Type a number:");
        int number = sc.nextInt();
        insertNodeTree(number);

    }

    private static void insertNodeTree(int number) {
        BTree node = new BTree();
        node.number = number;
        node.left = null;
        node.right = null;
        if (root == null) {
            root = node;
        } else {
            BTree previous = null;
            BTree aux = root;
            while (aux != null) {
                previous = aux;
                if (number < aux.number) {
                    aux = aux.left;
                } else {
                    aux = aux.right;
                }
            }
            if (number < previous.number) {
                previous.left = node;
            } else {
                previous.right = node;
            }
        }
    }

    private static void showTree() {
        int option = -1;
        while (option < 0 || option > 3) {
            System.out.println("1.- InOrden");
            System.out.println("2.- Preorden");
            System.out.println("3.- PostOrden");
            option = sc.nextInt();
        }

        switch (option) {
            case 1:
                showTreeInOrden(root);
                System.out.println();
                break;
            case 2:
                showTreePreOrden(root);
                System.out.println();
                break;
            case 3:
                showTreePostOrden(root);
                System.out.println();
                break;
        }
    }

    private static void showTreePostOrden(BTree node) {
        if (node != null) {
            showTreePostOrden(node.left);
            showTreePostOrden(node.right);
            System.out.print(node.number + " ");
        }
    }

    private static void showTreePreOrden(BTree node) {
        if (node != null) {
            System.out.print(node.number + " ");
            showTreePreOrden(node.left);
            showTreePreOrden(node.right);
        }
    }

    private static void showTreeInOrden(BTree node) {
        if (node != null) {
            showTreeInOrden(node.left);
            System.out.print(node.number + " ");
            showTreeInOrden(node.right);
        }
    }
}