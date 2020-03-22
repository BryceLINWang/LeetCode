package Leetcode;

import java.util.*;

public class waterandjugproblem {
    private class State{
        private int x;
        private int y;

        public State(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "State{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof State)) return false;
            State state = (State) o;
            return x == state.x &&
                    y == state.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    public  boolean canMeasureWater1(int x, int y, int z) {
      if(z==0) return true;
      if(x+y<z)return false;
      State state=new State(0,0);
      //广度优先遍历使用队列
        Queue<State>queue=new LinkedList<>();
        Set<State>set=new HashSet<>();
        queue.offer(state);
        set.add(state);
        while (!queue.isEmpty()){
            State head=queue.poll();
            int curx=head.getX();
            int cury=head.getY();
            if(curx==z||cury==z||curx+cury==z){
                return true;
            }
            //从当前状态获取所有可能下一步状态
            List<State>nextStates=getNextStates(curx,cury,x,y);
            // System.out.println(head + " => " + nextStates);

            for (State nextState : nextStates) {
                if (!set.contains(nextState)) {
                    queue.offer(nextState);
                    // 添加到队列以后，必须马上设置为已经访问，否则会出现死循环
                    set.add(nextState);
                }
            }
        }
        return false;
    }
    private List<State>getNextStates(int curx,int cury,int x,int y){
        List<State>nextStates =new ArrayList<>(8);
        //8个状态
        State nextState1=new State(x,cury);//a满
        State nextState2=new State(curx,y);//b满
        State nextState3=new State(0,cury);//a空
        State nextState4=new State(curx,0);//b空
        //从a到b,使得b满,a还有剩
        State nextState5=new State(curx-(y-cury),y);
        //从a到b,此时a的水太少，a倒空，b没有满
        State nextState6=new State(0,curx+cury);
        //从b到a,使a满，b还有剩余
        State nextState7=new State(x,cury-(x-curx));
        //从b到a,此时b的水太少，b倒尽，a没有满
        State nextState8=new State(curx+cury,0);
        //没满倒满
        if(curx<x){
            nextStates.add(nextState1);
        }
        if(cury<y){
            nextStates.add(nextState2);
        }
        //有水倒空
        if(curx>0){
            nextStates.add(nextState3);
        }
        if(cury>0){
            nextStates.add(nextState4);
        }
        //有剩才倒
        if(curx-(y-cury)>0){
            nextStates.add(nextState5);
        }
        if(cury-(x-curx)>0){
            nextStates.add(nextState7);
        }
        //倒了没倒满
        if(curx+cury<y){
            nextStates.add(nextState6);
        }
        if(cury+curx<x){
            nextStates.add(nextState8);
        }
     return nextStates;
    }
    public static boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) return false;
        if (x == 0 || y == 0) return z == 0 || x + y == z;
        return z % gcd(x, y) == 0;
    }
    public static int gcd(int a,int b){
        while (b!=0){
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public static void main(String[] args) {
     int x=3,y=5,z=4;
     int x1=2,y1=6,z1=5;
        waterandjugproblem aaa=new waterandjugproblem();
        System.out.println(aaa.canMeasureWater1(3,5,4));
        System.out.println(canMeasureWater(3,5,4));
        System.out.println(canMeasureWater(2,6,5));
        System.out.println(gcd(2,6));
    }
}
