#分发饼干
+ 思想
    + 贪心
    >寻找局部最优解

    >在此题目中，希望喂饱的孩子更多，则希望每次喂孩子的饼干饱腹度都是能满足孩子胃口的最小值
    + 排序
    > 将两个数组从小到大排列
    + 双指针
    >一个指针指向孩子的胃口，一个指针指向饼干。

```java
    public static int findContentChildren(int[] g, int[] s) {
        //int n=0;
        int i=0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                //n++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
```