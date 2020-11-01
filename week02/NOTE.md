# 学习笔记

## 2020/10/27

### 2.5.1 哈希表、映射、集合的实现与特性

HashTable: 最好O(1)，最坏O(n)

HashMap: 最好O(1)，最坏O(n)  =======源码未看，待做总结==========

HashSet：.add(e)方法底层是在HashMap中利用put方法放入对应的key中来添加。

![image-20201027213219484](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201027213219484.png)

![image-20201027213254599](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201027213254599.png)

![image-20201027213842872](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201027213842872.png)

TreeMap 和 TreeSet 底层都是红黑树实现，复杂度都是严格O(logn)的

![image-20201027221950517](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201027221950517.png)

![image-20201027222106898](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201027222106898.png)

待更。。。