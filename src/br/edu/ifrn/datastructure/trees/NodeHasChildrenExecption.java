package br.edu.ifrn.datastructure.trees;

public class NodeHasChildrenExecption extends Exception {

    public NodeHasChildrenExecption() {
        super("Node has children.");
    }

    public NodeHasChildrenExecption(String message) {
        super(message);
    }
}
