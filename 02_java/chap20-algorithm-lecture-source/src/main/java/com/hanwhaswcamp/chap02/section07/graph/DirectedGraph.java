package com.hanwhaswcamp.chap02.section07.graph;

import java.util.*;

/* 1. 방향 그래프 (인접 리스트) */
public class DirectedGraph<T> {

    private Map<T, List<T>> adjList;    // 정점과 이웃 정점을 저장할 map
    private List<T> visited;    // 해당 정점 방문 여부

    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    public void addVertex(T vertex) {
        // putIfAbsent: key 값이 존재하는 경우 Map의 value를 반환하고,
        // key 값이 존재하지 않는 경우 key와 value를 저장 후 null 반환
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    /* 방향 그래프이기 때문에 from에서 to로 이웃 정점 추가 */
    public void addEdge(T from, T to) {
        addVertex(from);
        addVertex(to);
        adjList.get(from).add(to);
    }

    public void removeVertex(T vertex) {
        adjList.values().forEach(edge -> edge.remove(vertex));  // 제거할 정점과 연결 된 간선 제거
        adjList.remove(vertex); // 정점 제거
    }

    /* 방향 그래프이기 때문에 간선 제거 시 from에서 to를 제거 */
    public void removeEdge(T from, T to) {
        List<T> edges = adjList.get(from);
        if (edges != null) edges.remove(to);
    }

    // Stack을 이용한 DFS(깊이 우선 탐색)
    public List<T> dfsUsingStack(T start) {
        visited = new ArrayList<>();
        Stack<T> stack = new Stack<>();

        // 시작 정점을 스택에 담음
        stack.push(start);

        /* 스택에서 꺼낼 정점이 없을 때까지 반복 */
        while (!stack.isEmpty()) {
            T vertex = stack.pop(); // 탐색할 정점을 꺼낸다.

            if (!visited.contains(vertex)) { // 방문 여부 확인(사이클 방지)
                visited.add(vertex);    // 방문한 적이 없으면 방문

                for (T v : adjList.getOrDefault(vertex, new ArrayList<>())) {
                    if (!visited.contains(v)) {
                        stack.push(v);  // 방문한 적이 없다면 해당 정점의 이웃을 모두 스택에 담는다.
                    }
                }
            }

        }

        return visited;
    }

    // 재귀 호출을 이용한 DFS
    public List<T> dfsUsingRecursion(T start) {
        visited = new ArrayList<>();
        dfsUsingRecursionHelper(start, visited);
        return visited;
    }

    private void dfsUsingRecursionHelper(T start, List<T> visited) {
        if (!visited.contains(start)) { // 이미 방문한 정점이라면 재귀 호출이 return 된다.
            visited.add(start);
            for (T v : adjList.getOrDefault(start, new ArrayList<>())) {
                if (!visited.contains(v)) {
                    dfsUsingRecursionHelper(v, visited);    // 재귀 함수를 통해 반복 호출을 하되
                }
            }
        }
    }

    // Queue를 이용한 BFS 구현
    public List<T> bfsUsingQueue(T start) {
        visited = new ArrayList<>();
        Queue<T> queue = new LinkedList<>();
        queue.offer(start);

        // 큐에 담긴 정점이 없을 때까지 반복
        while (!queue.isEmpty()) {
            T vertex = queue.poll();

            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (T v : adjList.getOrDefault(vertex, new ArrayList<>())) {
                    if (!visited.contains(v)) {
                        queue.offer(v);
                    }
                }
            }

        }
        return visited;
    }

    /* 두 노드 간의 경로가 있는지 확인하는 메서드 구현하기
    * -> 테스트 클래스에서 테스트 메소드로 확인 */
    public boolean hasPath(T start, T end) {
        visited = new ArrayList<>();
//         1. DFS 사용 버전
//           return hasPathDfs(start, end, visited);

//        2. BFS 사용 방법
//        return hasPathBFS(start, end, visited);

//        3. 재귀함수 이용 DFS
        UsingRecursionHelper(start, visited);
        if(visited.contains(end)) return true;
        else return false;
    }

    private boolean hasPathBFS(T start, T end, List<T> visited) {
        Queue<T> queue = new LinkedList<>();
        queue.offer(start);

        // 큐에 담긴 정점이 없을 때까지 반복
        while (!queue.isEmpty()) {
            T vertex = queue.poll();

            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (T v : adjList.getOrDefault(vertex, new ArrayList<>())) {
                    if (!visited.contains(v)) {
                        queue.offer(v);
                        if(v.equals(end)) {
                            return true;
                        }
                    }
                }
            }

        }
        return false;
    }

    private boolean hasPathDfs(T start, T end, List<T> visited) {
        Stack<T> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            T vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (T v : adjList.getOrDefault(vertex, new ArrayList<>())) {
                    if (!visited.contains(v)) {
                        stack.push(v);
                        if(v.equals(end)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void UsingRecursionHelper(T start, List<T> visited) {
        if (!visited.contains(start)) {
            visited.add(start);
            for (T v : adjList.getOrDefault(start, new ArrayList<>())) {
                if (!visited.contains(v)) {
                    dfsUsingRecursionHelper(v, visited);
                }
            }
        }
    }

}