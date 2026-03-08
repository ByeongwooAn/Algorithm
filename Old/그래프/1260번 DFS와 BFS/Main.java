import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //DFS 동작 원리
        // 1. 시작 노드 방문
        // 2. 연결된 노드 중 아직 방문하지 않은 노드로 이동
        // 3. 더 이상 방문할 노드가 없으면 뒤로 돌아감
        // 4. 모든 노드가 방문될 때까지 2-3 반복
        // 특징
        // - 스택 자료구조 사용 (재귀적 구현)
        // - 깊이 우선 탐색
        //BFS 동작 원리
        // 1. 시작 노드 방문
        // 2. 연결된 노드를 큐에 저장
        // 3. 큐에서 하나씩 꺼내면서 탐색
        // 4. 모든 노드가 방문될 때까지 2-3 반복
        // 특징
        // - 큐 자료구조 사용 (반복적 구현)
        // - 너비 우선 탐색

        // 첫 줄에는 정점의 개수 N, 간선의 개수 M, 탐색을 시작할 정점의 번호 V가 주어진다.
        // 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
        // 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다.
        // 입력으로 주어지는 간선은 양방향이다.
        // 방문할 수 있는 정점이 여러개인 경우 정점 번호가 작은 것을 먼저 방문해라.

        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수
        int V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호

        // 1. 그래프 그리기
        List<List<Integer>> graph = new ArrayList<>();
        // 1-1. 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 1-2. 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }


        // 2. DFS와 BFS 수행
        // 2-1. DFS 수행
        boolean[] visitedDFS = new boolean[N + 1]; // 방문 여부 체크 배열
        StringBuilder sbDFS = new StringBuilder(); // DFS 결과 저장용 StringBuilder
        dfs(graph, visitedDFS, V, sbDFS); // DFS 수행

        // 2-2. BFS 수행
        boolean[] visitedBFS = new boolean[N + 1]; // 방문 여부 체크 배열
        StringBuilder sbBFS = new StringBuilder(); // BFS 결과 저장용 StringBuilder
        bfs(graph, visitedBFS, V, sbBFS); // BFS 수행

        // 3. 결과 출력
        System.out.println(sbDFS.toString().trim());
        System.out.println(sbBFS.toString().trim());

        // 4. 자원 해제
        br.close();
    }

    // 5. DFS 구현
    static void dfs(List<List<Integer>> graph, boolean[] visitedDFS, int V, StringBuilder sbDFS) {
        visitedDFS[V] = true; // 현재 노드 방문 처리
        sbDFS.append(V).append(" "); // 방문한 노드 번호 저장

        // 연결된 노드 중 아직 방문하지 않은 노드로 이동
        for(int neighbor : graph.get(V)) {
            if (!visitedDFS[neighbor]) {
                dfs(graph, visitedDFS, neighbor, sbDFS); // 재귀적으로 DFS 수행
            }
        }
    }

    // 6. BFS 구현
    static void bfs(List<List<Integer>> graph, boolean[] visitedBFS, int V, StringBuilder sbBFS) {
        Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 큐
        queue.offer(V); // 시작 노드 큐에 추가
        visitedBFS[V] = true; // 시작 노드 방문 처리

        while (!queue.isEmpty()) {
            int current = queue.poll(); // 큐에서 하나씩 꺼내면서 탐색
            sbBFS.append(current).append(" "); // 방문한 노드 번호 저장

            // 연결된 노드를 큐에 저장
            for (int neighbor : graph.get(current)) {
                if (!visitedBFS[neighbor]) {
                    visitedBFS[neighbor] = true; // 방문 처리
                    queue.offer(neighbor); // 큐에 추가
                }
            }
        }
    }
}