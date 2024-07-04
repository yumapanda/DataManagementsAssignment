import java.util.Scanner;

class Queue{
        private int[] buffer;
        private int head;
        private int tail;
        private final int max_size;
        private int[] queue;

        Queue(int N){
                this.head = 0;
                this.tail = 0;
                this.max_size = N;
                this.queue = new int[N];
        }

        void push(int x){
                queue[head] = x;
                if(++head == max_size) head = 0;
        }

        int pop(){
                int res = queue[tail];
                if(++tail == max_size) tail = 0;
                return res;
        }

        int size(){
                if(head < tail) return head - tail + max_size;
                else return head - tail;
        }




        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int M = sc.nextInt();
                Queue[] que = new Queue[N];
                for(int i = 0; i < N; i++) que[i] = new Queue(M);

                for(int i = 0; i < M; i++){
                        int t = sc.nextInt();
                        int x = sc.nextInt();
                        if(t == 0){
                                System.out.println(que[x - 1].pop());
                        }
                        else{
                                int id = 0;
                                for(int j = 0; j < N; j++){
                                        if(que[j].size() < que[id].size()) id = j;
                                }
                                que[id].push(x);
                        }
                }
        }
}