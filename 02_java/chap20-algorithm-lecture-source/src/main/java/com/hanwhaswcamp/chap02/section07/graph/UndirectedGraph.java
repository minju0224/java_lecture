package com.hanwhaswcamp.chap02.section07.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 2. 무방향 그래프 ( 연결 리스트 )*/
public class UndirectedGraph<T> {
    private Map<T, List<T>> adjList; // 정점과 이웃 정점을 저장할 map

    public UndirectedGraph() {
        adjList = new HashMap<T, List<T>>();
    }

    public void addVertex(T vertex) {
        // ! 동일한 값을 입력하면 덮어쓰기가 됨
        // putIfAbsent : key값이 존재하는 경우 Map의 value를 반환하고,
        // key값이 존재하지 않는 경우 key와 value를 저장 후 null 반환
        adjList.put(vertex, new ArrayList<T>());
    }

    /* 무방향 그래프이기 때문에 양쪽에 이웃 정점 추가 */
    public void addEdge(T vertex1, T vertex2) {
        addVertex(vertex1);
        addVertex(vertex2);
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
    }


    public void removeVertex(T vertex) {
        adjList.values().forEach(edge -> edge.remove(vertex));      // 제거할 정점과 연결 된 간선 제거
        adjList.remove(vertex);     // 정점 제거
    }

    /* 무방향 그래프이기 떄문에 간선 제거 시 양쪽 노드에서 제게*/
    public void removeEdge(T vertex1, T vertex2) {
        List<T> edges1 = adjList.get(vertex1);
        List<T> edges2 = adjList.get(vertex2);
        if(edges1 != null) edges1.remove(vertex2);
        if(edges2 != null) edges2.remove(vertex1);
    }

}
