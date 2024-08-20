package com.hanwhaswcamp.chap02.section07.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 3. 가중치 그래프 ( 인접 리스트 )*/
public class WeightedGraph<T> {
    /* 정점과 이웃 정점을 저장할 때 map, 가중치는 Map으이 Integer 타입으로 표기 */
    private Map<T, Map<T, Integer>> adjList; // 정점과 이웃 정점을 저장할 map

    public WeightedGraph() {
        adjList = new HashMap<T, Map<T, Integer>>();
    }

    public void addVertex(T vertex) {
        // ! 동일한 값을 입력하면 덮어쓰기가 됨
        // putIfAbsent : key값이 존재하는 경우 Map의 value를 반환하고,
        // key값이 존재하지 않는 경우 key와 value를 저장 후 null 반환
        adjList.putIfAbsent(vertex, new HashMap<>());
    }

    /* 간선 추가 시 가중치도 함께 추가 됨 */
    public void addEdge(T from, T to, int weight) {
        addVertex(from);
        addVertex(to);
        adjList.get(from).put(to, weight);
    }


    public void removeVertex(T vertex) {
        adjList.values().forEach(edge -> edge.remove(vertex));      // 제거할 정점과 연결 된 간선 제거
        adjList.remove(vertex);     // 정점 제거
    }

    public void removeEdge(T from, T to) {
        Map<T, Integer> edges = adjList.get(from);
        if(edges != null) edges.remove(to);
    }

}
