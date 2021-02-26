package 算法很美蓝桥学院;

import java.util.HashSet;
import java.util.Set;

public class UnionFind {
	
	//查找父类
	public static UFNode find(UFNode x) {
		UFNode f = x;
		Set<UFNode> path = new HashSet<UnionFind.UFNode>();
		while (f.praNode!=null) {
			path.add(f.praNode); // 保存节点
			f = f.praNode;
		}
		
		for(UFNode ufNode:path) {
			ufNode.praNode = f;
		}
		return f;
		
	}
	
	// 子集相互关联
	public static void union(UFNode xNode ,UFNode y) {
		find(xNode).praNode = find(y);
	}

	
	public static class UFNode{
		UFNode praNode; // 节点
	}
}