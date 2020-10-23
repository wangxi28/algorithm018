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

# 1.3 数组、链表、跳表的基本实现和特性

![image-20200926213014509](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20200926213014509.png)

1、数组：增加删除O(n),随机查找O(1)

2、链表：增加删除O(1),查找O(n)

3、跳表：时复O(log n),空复O(n)

![image-20201022141934751](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201022141934751.png)

Java源码查看（网页版）：http://developer.classpath.org/doc/overview-summary.html

# 1.4栈和队列

## 1、双端队列  deque(Double-End Queue)

![image-20201023091344012](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023091344012.png)

![image-20201023091623634](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023091623634.png)

## 2、栈 Stack

![image-20201023105725577](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023105725577.png)

![image-20201023105821069](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023105821069.png)

```java
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);   //[1, 2, 3]
        System.out.println(stack.search(2));  //2

        stack.pop();
        stack.pop();
        //stack.pop();   
        boolean isEmpty = stack.empty();
        Integer topElement = stack.peek();
        System.out.println(topElement); //1
        System.out.println(isEmpty);//false
        System.out.println("3的位置"+stack.search(3));//3的位置-1
        System.out.println("1的位置"+stack.search(1));//1的位置1
```

栈从1开始计数，不在栈中的话search( )返回-1。

## 3、Queue<接口>

![image-20201023110209890](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023110209890.png)

![image-20201023110010205](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023110010205.png)

![image-20201023194655221](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023194655221.png)

```
Queue<String> queue = new LinkedList<String>();
queue.offer("one");
queue.add("two");//IllegalStateException异常

String pollElement1 = queue.poll();
System.out.println(pollElement1);//one
System.out.println(queue);//[two]

String removeElement2 = queue.remove();
System.out.println(removeElement2);//two
System.out.println(queue);//[ ]

String peekElement1 = queue.peek();
System.out.println(peekElement1);//null
System.out.println(queue);//[]
String element1 = queue.element();
System.out.println(element1);//异常，java.util.NoSuchElementException
System.out.println(queue);//[]
```



## 4、Deque<接口>

![image-20201023110359945](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023110359945.png)

![image-20201023110422370](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023110422370.png)

![image-20201023110646681](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023110646681.png)

![image-20201023201426738](C:\Users\WXJ\AppData\Roaming\Typora\typora-user-images\image-20201023201426738.png)

```
        Deque<String> deque = new LinkedList<String>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);//[c, b, a]

        String str = deque.peek();
        System.out.println(str);//c
        System.out.println(deque);//[c, b, a]

        while(deque.size()>0) {
            System.out.println(deque.pop());//c->b->a
        }
        System.out.println(deque);//[ ]
```

