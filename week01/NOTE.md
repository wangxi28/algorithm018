学习笔记

# 2020/10/21

# 0.时间复杂度

O(1) 常数复杂度 执行一次
O(log n) 对数复杂度 for i:=0 i<n i=i*2
O(n) 线性时间复杂度 for i:=0 i<n i++ {} 执行n次
O(n^2) 平方 for for 
O(n^3) 立方 for for for
O(2^n) 指数 斐波那契
O(n!) 阶层 

二分查找 n个数中找到指定值 每次找一边 -------O(log n)
二叉树遍历 -------O(n) 前序后序中序遍历 有且仅有一次访问节点 
二维矩阵的二分查找 -------O(n) 记住就行
归并排序 -------O(nlog n) 记住就行
图的遍历 有且仅有一次访问 O(n)
深度优先 广度优先 有且仅有一次-------O(n)

空间复杂度
一维数组 -------O(n)
二维数组 展开n*n -------O(n^2)
递归 展开最深的深度 就是复杂度最大值

# 2020/10/22

# 1. 数组、链表、跳表的基本实现和特性

![image-20200926213014509](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20200926213014509.png)

1、数组：增加删除O(n),随机查找O(1)

2、链表：增加删除O(1),查找O(n)

3、跳表：时复O(log n),空复O(n)

![image-20201022141934751](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201022141934751.png)

Java源码查看（网页版）：http://developer.classpath.org/doc/overview-summary.html

