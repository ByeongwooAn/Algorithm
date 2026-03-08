import java.util.*;
import java.io.*;

public class Review1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 개수 입력
        int M = Integer.parseInt(st.nextToken()); // 간선 개수 입력
        int V = Integer.parseInt(st.nextToken()); // 시작 정점 입력

        // 그래프를 담을 List 생성
        List<List<Integer>> graph = new ArrayList<>();

        // 그래프 초기화
        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 양방향 그래프 입력
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 그래프 정렬
        for(int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS 실행
        boolean[] visitDFS = new boolean[N + 1]; // 방문 여부를 저장할 배열
        StringBuilder sbDFS = new StringBuilder(); // DFS 결과를 저장할 StringBuilder
        dfs(graph, visitDFS, sbDFS, V);

        // BFS 실행
        boolean[] visitBFS = new boolean[N + 1]; // 방문 여부를 저장할 배열
        StringBuilder sbBFS = new StringBuilder(); // BFS 결과를 저장할 StringBuilder
        bfs(graph, visitBFS, sbBFS, V);

        // 결과 출력
        System.out.println(sbDFS.toString().trim());
        System.out.println(sbBFS.toString().trim());

        // 자원 해제
        br.close();

    }

    // DFS 구현
    static void dfs(List<List<Integer>> graph, boolean[] visitDFS, StringBuilder sbDFS, int V) {
        Stack<Integer> stack = new Stack<>();

        stack.push(V);

        while(!stack.isEmpty()) {
            int current = stack.pop();

            if(visitDFS[current]) {
                continue;
            }
            visitDFS[current] = true;

            sbDFS.append(current).append(" ");

            List<Integer> reverseGraph = graph.get(current);

            for(int i = reverseGraph.size() - 1; i >= 0; i--) {
                int neighbor = reverseGraph.get(i);

                if(!visitDFS[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }

    // BFS
    static void bfs(List<List<Integer>> graph, boolean[] visitBFS, StringBuilder sbBFS, int V) {
        Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 큐
        
        visitBFS[V] = true;
        queue.offer(V);

        while(!queue.isEmpty()) {
            int current = queue.poll(); // 큐를 하나씩 꺼내면서 탐색
            sbBFS.append(current).append(" ");

            for(int neighbor : graph.get(current)) {
                if(!visitBFS[neighbor]) {
                    visitBFS[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
