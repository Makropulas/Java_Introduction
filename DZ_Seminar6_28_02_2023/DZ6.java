//Учитывая двоичного дерева, верните порядок обхода значений его узлов.
// пример
// Input: root = [1,null,2,3]
// Output: [1,2,3]

package DZ_Seminar6_28_02_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DZ6 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null, new TreeNode(2,null,new TreeNode(3)));

        System.out.println(preorderTraversal(root));
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        while(root!=null || !stack.isEmpty()){

            while(root!=null){
                res.add(root.val);
                stack.add(root);
                root = root.left;
            }

            if(stack.isEmpty()){
                return res;
            }

            root = stack.pop();
            root = root.right;
        }
        return res;
    }
}

