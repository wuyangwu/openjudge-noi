package 算法很美蓝桥学院;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Edge implements Comparable<Edge>{
	char start,end;
	int dis;
	public Edge(char start ,char end,int dis) {
		this.start = start;
		this.end = end;
		this.dis = dis;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.dis - o.dis;
	}
}
public class kruskal {
	private List<Edge> edgeList = new LinkedList<Edge>();
	private Set<Edge> T = new HashSet<Edge>(); //生成树的边集
	private Map pntAndNodeMap = new HashMap();
    private int n =0; // 节点数量
	
	public kruskal(List<Edge> list , int n) {
		edgeList = list;
		for (Edge edge:edgeList) {
			pntAndNodeMap.put(edge.start,new UnionFind.UFNode());
			pntAndNodeMap.put(edge.end, new UnionFind.UFNode());
		}
		this.n = n;
		BuildMST(); // 生成最小生成树
	}
	
	private void BuildMST() {
		Collections.sort(edgeList); // 按照权值排序
//		for (Edge edge:edgeList) {
//
//			UnionFind.UFNode uxNode  = (UnionFind.UFNode)pntAndNodeMap.get(edge.start);
//			UnionFind.UFNode uyNode  =  (UnionFind.UFNode)pntAndNodeMap.get(edge.end);
//			if(UnionFind.find(uxNode)) {
//			  continue;
//			}
//
//			if( == n-1) {
//				break;
//			}
//
//		}
	}
	
	// kruskal 最小生成树  这个需要用到并查集
	public static void main() {
		List<Edge> findEdges = build(); // 构建数据
		
		
	}
	
	private static List<Edge> build(){
		List<Edge> list = new LinkedList<Edge>();
		list.add(new Edge('z','w',5));
		list.add(new Edge('z', 'b', 8));
		list.add(new Edge('b', 'd', 5));
		list.add(new Edge('b', 'l', 4));
		list.add(new Edge('l', 'f', 2));
		list.add(new Edge('l', 'h',4 ));
		list.add(new Edge('f', 'c',7 ));
		list.add(new Edge('f','h',3 ));
		list.add(new Edge('h', 'c',6 ));
		list.add(new Edge('h', 'y',5 ));
		list.add(new Edge('c','y',6 ));
		list.add(new Edge('h', 'x',7 ));
		list.add(new Edge('y', 'x',5 ));
		list.add(new Edge('x', 'w', 8));
		list.add(new Edge('w', 'b', 5));
		return list;
	}
	
}





















