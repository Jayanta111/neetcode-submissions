class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {

        Set<Node> set = new HashSet<>();

        // Store all ancestors of p
        while (p != null) {
            set.add(p);
            p = p.parent;
        }

        // Find the first common ancestor of q
        while (q != null) {

            if (set.contains(q)) {
                return q;
            }

            q = q.parent;
        }

        return null;
    }
}