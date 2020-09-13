## 学习笔记
```
第一周重新学习了数组与链表的数组结构，在此之前看得很多，动手很少，导致了自己常常在真正面试的时候写不出来。
```
```
1. 要尝试使用java中的队列和栈的API，其中双端队列的Deque 及其实现类 ArrayQueue 和 LinkedList
的常用方法的掌握非常重要，可在面试时熟练的写出来，形成习惯。
2. LinkedList 构造方法中，可以确定元素是以插入顺序进行排序还是访问access顺序调整顺序，而后者可用于LRUcache
3. 链表及数组的大量算法中，都使用了双指针-快慢指针/夹逼的方法进行操作，很有相似性，在刻意联系时，可以链表和数组同时进行练习。
```
```java
Deque<E>
void addFirst(E e); //  When using a capacity-restricted deque, it is generally  * preferable to use method {@link #offerLast}
void addLast(E e); // When using a capacity-restricted deque, it is generally  * preferable to use method {@link #offerLast}
boolean offerFirst(E e); // which can fail to insert an element only by throwing an exception
boolean offerLast(E e);  // which can fail to insert an element only by throwing an exception
E removeFirst(); // throw exception if this deque is empty
E removeLast(); // throw exception if this deque is empty
E pollFirst(); //  return null if this deque is empty
E pollLast(); // return null if this deque is empty
E getFirst(); // throws an exception if this deque is empty
E getLast(); // throws an exception if this deque is empty
E peekFirst(); //  returns {@code null} if this deque is empty
E peekLast(); //  returns {@code null} if this deque is empty
```
LinkedHashMap 实现了LRUCache功能
```java
LinkedHashMap<E> 
Map<Integer, Integer> cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return this.size() > capacity;
        }
    };
```