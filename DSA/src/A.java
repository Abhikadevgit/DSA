class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class CustomTreeSet {
    private TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);
        if (value < root.value) root.left = insertRec(root.left, value);
        else if (value > root.value) root.right = insertRec(root.right, value);
        return root;  // Avoid duplicates
    }

    public boolean contains(int value) {
        return containsRec(root, value);
    }

    private boolean containsRec(TreeNode root, int value) {
        if (root == null) return false;
        if (value == root.value) return true;
        return value < root.value ? containsRec(root.left, value) : containsRec(root.right, value);
    }

    public void remove(int value) {
        root = removeRec(root, value);
    }

    private TreeNode removeRec(TreeNode root, int value) {
        if (root == null) return null;
        if (value < root.value) root.left = removeRec(root.left, value);
        else if (value > root.value) root.right = removeRec(root.right, value);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.value = minValue(root.right);
            root.right = removeRec(root.right, root.value);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        int minV = root.value;
        while (root.left != null) {
            minV = root.left.value;
            root = root.left;
        }
        return minV;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        CustomTreeSet set = new CustomTreeSet();
        set.insert(50);
        set.insert(30);
        set.insert(70);
        set.insert(20);
        set.insert(40);
        set.inorder();
        System.out.println(set.contains(30));  // true
        set.remove(30);
        set.inorder();
    }
}
