package phoenix.牛客;

public class 二维数组中的查找 {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0){
            return false;
        }
        int rows=array.length,columns=array[0].length;
        int row=0,column=columns-1;
        while(row<rows&&column>=0){
            int num=array[row][column];
            if(num==target){
                return true;
            }else if(num<target){
                row++;

            }else{
                column--;
            }
        }
        return false;
    }
}
