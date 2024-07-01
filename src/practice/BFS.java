package practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        // 그래프를 2차원 배열로 표현
        // 배열의 인덱스를 노드와 매칭 위해 0번 사용 안함
        // 1번 인덱스 = 1번노드
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5},{5,7}, {3,4,7},{2}, {4,5}, {1,2}};

        // 방문처리를 위한 boolean 배열 선언
        boolean[] visited = new boolean[graph.length];

        System.out.println(visited);
        System.out.println(bfs(1,graph,visited));

    }
    static String bfs(int start, int[][] graph, boolean[] visited) {
        // 탐색 순서 출력
        StringBuilder sb = new StringBuilder();
        // BFS 의 핵심 큐 생성
        Queue<Integer> q = new LinkedList<Integer>();

        // BFS를 시작할 노드 번호
        q.offer(start);

        // 시작 노드 방문처리
        visited[start] = true;

        // 큐가 빌 때까지 방문
        while (!q.isEmpty()) {
            int nodeIndex = q.poll();
            sb.append(nodeIndex + " -> ");
            // 큐에서 꺼낸 노드와 연결된 노드들 체크
            for (int i = 0; i < graph[nodeIndex].length; i++) {
                int temp = graph[nodeIndex][i];
                // 방문하지 않았으면 방문처리 후 큐에 넣기
                if (!visited[temp]) {
                    visited[temp] = true;
                    q.offer(temp);
                }
            }
        }
        // 탐색 순서 리턴
        return sb.toString();
    }
}
