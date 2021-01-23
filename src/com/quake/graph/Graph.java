package com.quake.graph;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author AKA二夕
 * @create 2021-01-23 20:10
 */
public class Graph {
    private ArrayList<String> vertexList;// 存储顶点集合
    private int[][] edges;// 存储图对应的邻接矩阵
    private int numOfEdges;// 表示边的数目

    public static void main(String[] args) {

    }

    // 构造器
    public Graph(int n) {
        // 初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
    }

    // 返回节点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }

    // 返回边的数目
    public int getNumOfEdges() {
        return numOfEdges;
    }

    // 显示对应的矩阵
    public void showGraph() {
        for (int[] edge : edges) {
            System.out.println(Arrays.toString(edge));
        }
    }

    // 返回 v1 和 v2 的权值
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    // 插入结点
    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    /**
     * 添加边的方法
     *
     * @param v1     表示点的下标即第几个顶点
     * @param v2     表示第二个顶点的下标
     * @param weight 表示权值
     */
    public void insertEdge(int v1, int v2, int weight) {
        // 保证来回路径的权值一样
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;// 边的条数 +1
    }

}
