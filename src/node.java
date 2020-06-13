public class node {
    private int Id;
    private node rightNode;
    private node leftNode;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public node getRightNode() {
        return rightNode;
    }

    public void setRightNode(node rightNode) {
        this.rightNode = rightNode;
    }

    public node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(node leftNode) {
        this.leftNode = leftNode;
    }
}
