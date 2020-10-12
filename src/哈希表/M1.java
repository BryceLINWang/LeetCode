package 哈希表;


/**
 * 默认大小、负载因子以及扩容倍数
 * 底层数据结构
 * 如何处理hash冲突
 * 如何计算key的hash值
 * 数组长度为什么是2的幂次方
 * 查找、插入、扩容过程
 * fail-fast机制
 */
public class M1 {
    //1.8后HashMap是由数组+链表+红黑树组成
    //当一个值中要存储到HashMap中的时候会根据Key的值来计算出他的hash，
    // 通过hash值来确认存放到数组中的位置，如果发生hash冲突就以链表的形式存储，
    // 当链表过长的话，HashMap会把这个链表转换成红黑树来存储
    /**
     * //默认初始容量为16
     * static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
     * //默认负载因子为0.75
     * static final float DEFAULT_LOAD_FACTOR = 0.75f;
     * //Hash数组(在resize()中初始化)
     * transient Node<K,V>[] table;
     * //元素个数
     * transient int size;
     * //容量阈值(元素个数大于等于该值时会自动扩容)
     * int threshold;
     * //////////
     *那么为什么要把数组长度设计为2的幂次方呢？
     * 我个人觉得这样设计有以下几个好处：
     *
     * 1、当数组长度为2的幂次方时，可以使用位运算来计算元素在数组中的下标
     *
     * HashMap是通过index=hash&(table.length-1)这条公式来计算元素在table数组中存放的下标，
     * 就是把元素的hash值和数组长度减1的值做一个与运算，即可求出该元素在数组中的下标，这条公式其实等价于hash%length，也就是对数组长度求模取余，只不过只有当数组长度为2的幂次方时，
     * hash&(length-1)才等价于hash%length，使用位运算可以提高效率。
     *
     * 2、 增加hash值的随机性，减少hash冲突
     *
     * 如果 length 为 2 的幂次方，则 length-1 转化为二进制必定是 11111……的形式，
     * 这样的话可以使所有位置都能和元素hash值做与运算，如果是如果 length 不是2的次幂，比如length为15，则length-1为14，
     * 对应的二进制为1110，在和hash 做与运算时，最后一位永远都为0 ，浪费空间。
     *
     */
}
