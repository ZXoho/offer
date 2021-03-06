package algorithm;

/**
 * Created by zxoho on 2020/3/8 0008
 * Description:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {

    public static void main(String[] args) {
        RectCover test = new RectCover();
        System.out.println(test.RectCoverI(4));
    }

    public int RectCoverI(int target){
        if(target <= 0)
            return 0;
        if(target ==1)
            return 1;
        if(target == 2)
            return 2;
        return RectCoverI(target-1)+RectCoverI(target-2);
    }
}
