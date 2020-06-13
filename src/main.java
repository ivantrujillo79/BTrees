public class main {
    public static void main(String[] args) {
        System.out.println("This program is just a simple sample about using BTrees as the extraordinary data structure thtey are :)");

        System.out.println("Root node is to be created");
        node objRootNode = new node();
        objRootNode.setId(0);

        System.out.println("Child nodes are to be created");
        objRootNode.setRightNode(new node());
        objRootNode.setLeftNode(new node());


        System.out.println("Program finished successfully.");
    }
}
