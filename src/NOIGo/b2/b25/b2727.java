    package NOIGo.b2.b25;

    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Scanner;

    /**
     * @author wuyang
     * @version 1.0
     * @date 2020/2/9 17:56   李逍遥求药问题
     */
    class xiaoyao{
        int x , y, count;
        public xiaoyao(int x,int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    public class b2727 {

        static String[] ditu = new String[30];
        static int[][] biaozhi = new int[30][30];
        static int[] dx = {0,1,0,-1};
        static int[] dy = {-1,0,1,0};
        static int m = 0 ;
        static int n = 0;

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            while ((m = scanner.nextInt())!=0&&(n = scanner.nextInt())!=0){
                int t = -1;
                int x=0,y=0,x1=0,y1=0, t1 =0 ,w = 1;
                for (int i = 0; i< m ; i++)
                    ditu[i] = scanner.next();
                for (int i = 0 ; i<m; i++){
                    if (ditu[i].indexOf('@')>=0){
                        x = i; y = ditu[i].indexOf('@');
                    }
                    if (ditu[i].indexOf('*')>=0){
                        x1 = i; y1 = ditu[i].indexOf('*');
                    }
                }
                xiaoyao[] xiaoyaos = new xiaoyao[1000];
                xiaoyaos[0] = new xiaoyao(x,y,1);
//                biaozhi[x][y] = 1;
                while (t1<w){
                    int i = 0;
                    for (; i< 4 ;i ++){
                        int xx = xiaoyaos[t1].x+dx[i];
                        int yy = xiaoyaos[t1].y+dy[i];
                        if (xx>=0&&xx<=m-1&&yy>=0&&yy<=n-1){
                            if (xx == x1 && yy == y1){
                                t = xiaoyaos[t1].count;
                                break;
                            }
                            if (ditu[xx].charAt(yy)=='.'){
                                // 修改字符串的值
                                StringBuilder sb = new StringBuilder(ditu[xx]);
                                sb.replace(yy,yy+1,"#");
                                ditu[xx] = sb.toString();
                                xiaoyaos[w] = new xiaoyao(xx,yy,xiaoyaos[t1].count+1);
//                                xiaoyaos[w].x = xx;
//                                xiaoyaos[w].y = yy;
//                                xiaoyaos[w].count = xiaoyaos[t1].count+1;
                                w++;
                            }
                        }
                    }
                    if (i !=4){
                        break;
                    }
                    t1++;
                }

                System.out.println(t);
//                biaozhi = new int[30][30];
                ditu = new String[30];
            }
        }

    }

    //                Queue<xiaoyao> queue = new LinkedList<>();
//                queue.offer(new xiaoyao(x,y,0)); // 把初始位置存入数组中
//                biaozhi[x][y] = 1;  //初始位置标志为走过
//                while (!queue.isEmpty()){
//                    xiaoyao xiaoyao =  queue.peek(); //只读不拿
//                    if(ditu[xiaoyao.x].charAt(xiaoyao.y)=='*'){
//                        t = xiaoyao.count;
//                        break;
//                    }
//                    for (int i = 0; i< 4 ;i ++){
//                        int xx = xiaoyao.x + dx[i];
//                        int yy = xiaoyao.y + dy[i];
//                        if (xx>=0&&xx<=m-1&&yy>=0&&yy<=n-1&&biaozhi[xx][yy]!=1&&ditu[xx].charAt(yy)!='#'){
//                            biaozhi[xx][yy] = 1;
//                            queue.offer(new xiaoyao(xx,yy,xiaoyao.count+1));
//                        }
//                    }
//                    queue.poll(); // 消耗
//                }